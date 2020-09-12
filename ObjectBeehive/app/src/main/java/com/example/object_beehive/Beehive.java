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


}
