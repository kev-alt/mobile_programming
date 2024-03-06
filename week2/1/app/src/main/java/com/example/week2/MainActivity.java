package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etDerece;
    TextView tvResult;
    RadioButton rbFah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etDerece=(EditText)findViewById(R.id.editTextText);
        tvResult=(TextView)findViewById(R.id.textView);
        rbFah=(RadioButton)findViewById(R.id.radioButton3);
    }

    public void myClick(View v){

        double Derece=Double.parseDouble(etDerece.getText().toString());
        double Result;
        String str;

        if(rbFah.isChecked()){
            Result=Derece*9.0/5.0+32;
            str="girilen celsius" + Derece + " : " + Result + "fahrenheit";
        }
        else{
            Result=(Derece-32)*5.0/9.0;
            str="girilen fahrenheit" + Derece + " : " + Result + "celsius";
        }

        tvResult.setText(str);
    }
}