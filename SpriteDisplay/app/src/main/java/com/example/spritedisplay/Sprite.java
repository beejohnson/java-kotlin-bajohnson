package com.example.spritedisplay;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Sprite {

    private final Bitmap image;
    private int x, y;

    public Sprite(Bitmap bmp) {
        image = bmp;
        x = 100;
        y = 100;
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
    }

    public void update() {
        y++;
    }
}
