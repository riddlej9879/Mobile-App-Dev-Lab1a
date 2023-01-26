package com.example.lab1arockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ActivityManager binding;

    private RockPaperScissor rps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rps = new RockPaperScissor(false);
    }


    public void ChangeState(View view) {

        if (rps.isRunning()) {
            rps.setRunning(false);
            // Change button to start
        } else {
            rps.setRunning(true);
            // Change button to stop
        }
    }
}