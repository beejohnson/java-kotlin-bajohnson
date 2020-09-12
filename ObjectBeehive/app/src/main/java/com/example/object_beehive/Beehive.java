package com.example.object_beehive;

public class Beehive {
    public Beehive(double height) {
        if (height > 0.0) {
            this.height = height;
        } else {
            String message = "Invalid height " + height + "." +
                    " Must be positive.";
            throw new IllegalArgumentException(message);
        }
    }

    private double height;

    // method (getter)
    public double getHeight() {
        return height;
    }

    // computed property
    public boolean isDry() {
        return honeyLevel <= 0.0;
    }

    private double honeyLevel;

    public double getHoneyLevel() {
        return honeyLevel;
    }

    public void setHoneyLevel(double honeyLevel) {
        if (0 <= honeyLevel && honeyLevel <= height) {
            this.honeyLevel = honeyLevel;
        } else {
            String message = "Invalid honey level " + honeyLevel + "." +
                    " Must be between 0.0 and " + height + " (inclusive).";
            throw new IllegalArgumentException(message);
        }
    }

}
