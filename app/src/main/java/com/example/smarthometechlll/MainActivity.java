package com.example.smarthometechlll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Switch LED1, LED2, LED3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LED1 = findViewById(R.id.Led1);
        LED2 = findViewById(R.id.Led2);
        LED3 = findViewById(R.id.Led3);
    }
}