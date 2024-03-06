package com.example.week22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=(TextView)findViewById(R.id.textView2);
        String str=getIntent().getExtras().getString("data");

        MyDataCarier mdc= (MyDataCarier)getIntent().getExtras().getSerializable("MyData");

        tv.setText(str +"\n"+ mdc.getAd()+"\n"+ mdc.getSoyad() +"\n"+ mdc.getEmail());
    }
}