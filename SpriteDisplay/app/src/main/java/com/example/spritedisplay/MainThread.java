package com.example.spritedisplay;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class MainThread extends Thread{
    private SurfaceHolder surfaceHolder;
    private GameView gameView;
    private boolean running;
    public static Canvas canvas;

    public MainThread(SurfaceHolder surfaceHolder, GameView gameView) {

        super();
        this.surfaceHolder = surfaceHolder;
        this.gameView = gameView;
    }

   /* public void setRunning(boolean isRunning) {
        running = isRunning;
    }*/

    @Override
    public void run() {
        while(running) {
            canvas = null;

            canvas = this.surfaceHolder.lockCanvas();
            synchronized (surfaceHolder) {
                this.gameView.update();
                this.gameView.draw(canvas);
            }
        }
    }
    public void setRunning(boolean isRunning) { running = isRunning; }
}
