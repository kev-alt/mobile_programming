package com.example.web_view_uygulamasi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOpenWebView = findViewById(R.id.buttonOpenWebView);
        buttonOpenWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // WebViewActivity'yi başlat
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}

