package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView resultView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultView2 = (TextView) findViewById(R.id.resultView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        resultView2.setText("Result: " + str);
    }
}