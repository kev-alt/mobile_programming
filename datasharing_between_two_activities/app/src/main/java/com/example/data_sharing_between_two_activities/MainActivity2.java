package com.example.data_sharing_between_two_activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvData, tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvData = findViewById(R.id.textViewData);
        tvEmail = findViewById(R.id.textViewEmail);

        String str = getIntent().getStringExtra("data");
        MyDataCarier mdc = (MyDataCarier) getIntent().getSerializableExtra("MyData");

        tvData.setText(str + ", 2. Aktiviteye Hosgeldiniz");
        tvEmail.setText(mdc.getEmail());
    }
}