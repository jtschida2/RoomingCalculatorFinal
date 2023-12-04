package com.example.roomingcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public final class MainActivity extends AppCompatActivity {

    Button resultsButton;
    EditText editTextWidth;
    EditText editTextHeight;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        editTextHeight = findViewById(R.id.editTextHeight);
        editTextWidth = findViewById(R.id.editTextWidth);
        setupButton();
    }

    private void setupButton() {
        resultsButton = findViewById(R.id.showResultButton);
        resultsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                double height = Double.parseDouble(editTextHeight.getText().toString());
                double width = Double.parseDouble(editTextWidth.getText().toString());
                double area = height * width;

                //create intent that is sent to MainActivity2
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("height", height);
                intent.putExtra("width", width);
                intent.putExtra("area", area);
                startActivity(intent);
            }
        });
    }

}
