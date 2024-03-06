package com.example.week22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et= (EditText) findViewById(R.id.editTextText);

    }

    public void MyClick(View v){
        //Explicit
        Intent myInt = new Intent(this,MainActivity2.class);
        myInt.putExtra("data",et.getText().toString());
        MyDataCarier mdc= new MyDataCarier();
        mdc.setAd("Mustafa");
        mdc.setSoyad("En Sevdiğim Hoca");
        mdc.setEmail("mckasapbasi@ticaret.edu.tr");
        myInt.putExtra("MyData",mdc);
        startActivity(myInt);
    }
}