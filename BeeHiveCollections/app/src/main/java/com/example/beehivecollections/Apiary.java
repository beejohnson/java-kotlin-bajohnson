package com.example.beehivecollections;

import java.util.ArrayList;

public class Apiary extends DefaultHive {
    interface Frame {
        boolean emptyComb();
    }

    public class secondFrame implements Frame {
        double heightAboveBottomFrame;
        secondFrame(double heightAboveBottomFrame) {
            this.heightAboveBottomFrame = heightAboveBottomFrame;
        }
        public boolean emptyComb() {
            return getHoneyLevel() < heightAboveBottomFrame;
        }
    }

    public class fullFrame implements Frame {
        @Override public boolean emptyComb() {
            return false;
        }
    }

    ArrayList < Frame > frames = new ArrayList<>();

    public Apiary(double height) {
        super(height);
        frames.add(() -> false);
        for (int i = 1; i <= height + 3; ++i) {
            frames.add(new secondFrame(i));
        }
        frames.add(()->true);

    }

    public Apiary(double height, double level) {
        super(height, level);
    }

    public double getHoneyLevel() {
        return getLevel();
    }

    public void setHoneyLevel(double honeyLevel) {
        setLevel(honeyLevel);
    }

    public boolean emptyComb() { return isEmpty(); }

    public boolean Graynotoxin(boolean b) {
        return graynotoxin;
    }

    public void setGraynotoxin(boolean graynotoxin) {
        this.graynotoxin = graynotoxin;
    }
    private boolean graynotoxin;
}













