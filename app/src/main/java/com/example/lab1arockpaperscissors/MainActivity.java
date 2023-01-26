package com.example.lab1arockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ActivityManager binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RockPaperScissor rps = new RockPaperScissor();
    }

}