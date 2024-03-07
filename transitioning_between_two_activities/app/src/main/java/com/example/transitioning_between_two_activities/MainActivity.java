package com.example.transitioning_between_two_activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MyClick(View v) {
        Intent myInt = new Intent(this, MainActivity2.class);
        startActivity(myInt);
    }
}
