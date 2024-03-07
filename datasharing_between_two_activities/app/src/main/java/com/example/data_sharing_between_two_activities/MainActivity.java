package com.example.data_sharing_between_two_activities;

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
        et = findViewById(R.id.editTextText);
    }

    public void MyClick(View v) {
        Intent myInt = new Intent(this, MainActivity2.class);
        myInt.putExtra("data", et.getText().toString());

        MyDataCarier mdc = new MyDataCarier();
        mdc.setEmail("kevserraltunbey@gmail.com");
        myInt.putExtra("MyData", mdc);

        startActivity(myInt);
    }
}
