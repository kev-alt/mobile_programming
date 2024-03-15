package com.example.pomodoro;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textViewTimer, textViewStatus, textViewLoopCount;
    Button buttonStart, buttonStop, buttonReset;
    CountDownTimer countDownTimer;
    boolean isWorking = true; // True if it's work time, false if it's break time
    long workTime = 25 * 60 * 1000; // 25 minutes in milliseconds
    long breakTime = 5 * 60 * 1000; // 5 minutes in milliseconds
    long timeLeftInMillis = workTime;
    int loopCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTimer = findViewById(R.id.textViewTimer);
        textViewStatus = findViewById(R.id.textViewStatus);
        textViewLoopCount = findViewById(R.id.textViewLoopCount);
        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);
        buttonReset = findViewById(R.id.buttonReset);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
                buttonStart.setVisibility(View.VISIBLE);
                buttonStop.setVisibility(View.VISIBLE);
                buttonReset.setVisibility(View.VISIBLE);
                textViewStatus.setVisibility(View.VISIBLE);
                textViewLoopCount.setVisibility(View.VISIBLE);
            }
        });

        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer();
                buttonStart.setVisibility(View.VISIBLE);
                buttonStop.setVisibility(View.VISIBLE);
                buttonReset.setVisibility(View.VISIBLE);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
                buttonStart.setVisibility(View.VISIBLE);
                buttonStop.setVisibility(View.VISIBLE);
                buttonReset.setVisibility(View.VISIBLE);
                textViewStatus.setVisibility(View.INVISIBLE);
                textViewLoopCount.setVisibility(View.INVISIBLE);
            }
        });

        updateTimer();
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish() {
                switchTimer();
                startTimer();
            }
        }.start();
    }

    private void stopTimer() {
        countDownTimer.cancel();
    }

    private void resetTimer() {
        stopTimer();
        isWorking = true;
        timeLeftInMillis = workTime;
        loopCount = 0;
        updateTimer();
    }

    private void switchTimer() {
        if (isWorking) {
            isWorking = false;
            timeLeftInMillis = breakTime;
            textViewStatus.setText("Dinlenme Zamanı");
            textViewStatus.setVisibility(View.VISIBLE);
            loopCount++;
            textViewLoopCount.setText("Döngü Sayısı: " + loopCount);
        } else {
            isWorking = true;
            timeLeftInMillis = workTime;
            textViewStatus.setText("Çalışma Zamanı");
            textViewStatus.setVisibility(View.VISIBLE);
        }
    }

    private void updateTimer() {
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format("%02d:%02d", minutes, seconds);
        textViewTimer.setText(timeLeftFormatted);
    }
}
