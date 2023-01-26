package com.example.lab1arockpaperscissors;

import android.widget.TextView;

public class RockPaperScissor {
    private boolean running;

    public RockPaperScissor(boolean running) {
        this.running = running;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
