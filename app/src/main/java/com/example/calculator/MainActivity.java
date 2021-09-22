package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void goToResultPage(int result) {
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("message", result + "");
        startActivity(intent);
    }

    public void add(View view) {
        EditText input1 = (EditText) findViewById(R.id.inputOne);
        EditText input2 = (EditText) findViewById(R.id.inputTwo);
        
        int result = Integer.parseInt(input1.getText().toString()) + Integer.parseInt(input2.getText().toString());
        goToResultPage(result);
    }

    public void subtract(View view) {
        EditText input1 = (EditText) findViewById(R.id.inputOne);
        EditText input2 = (EditText) findViewById(R.id.inputTwo);

        int result = Integer.parseInt(input1.getText().toString()) - Integer.parseInt(input2.getText().toString());
        goToResultPage(result);
    }

    public void multiply(View view) {
        EditText input1 = (EditText) findViewById(R.id.inputOne);
        EditText input2 = (EditText) findViewById(R.id.inputTwo);

        int result = Integer.parseInt(input1.getText().toString()) * Integer.parseInt(input2.getText().toString());
        goToResultPage(result);
    }

    public void divide(View view) {
        EditText input1 = (EditText) findViewById(R.id.inputOne);
        EditText input2 = (EditText) findViewById(R.id.inputTwo);

        int result = Integer.parseInt(input1.getText().toString()) / Integer.parseInt(input2.getText().toString());
        goToResultPage(result);
    }
}