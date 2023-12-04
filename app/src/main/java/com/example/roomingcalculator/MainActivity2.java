package com.example.roomingcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView roomDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        roomDetails = findViewById(R.id.textViewTitle);
        double length = getIntent().getDoubleExtra("height", 0);
        double width = getIntent().getDoubleExtra("width", 0);
        double area = getIntent().getDoubleExtra("area", 0);
        roomDetails.setText("The length is " + length + " and the width is " + width + " and the overall area is " + area);
    }
}