package com.example.week23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivResim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivResim=(ImageView)findViewById(R.id.imageView);
        try {
            ivResim.setImageURI(Uri.EMPTY) ;getIntent().getExtras().get(Intent.EXTRA_STREAM);
        } catch (Exception e) {

        }

    }
}