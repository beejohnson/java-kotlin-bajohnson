package com.example.classhierarchy;

public class BeeHive extends DefaultHive {
    public BeeHive(double height) {
        super(height);
    }

    public BeeHive(double height, double level) {
        super(height, level);
    }

    public double getHoneyLevel() {
        return getLevel();
    }

    // method (setter)
    public void setHoneyLevel(double HoneyLevel) {
        setLevel(HoneyLevel);
    }

    public boolean isCapped() {
        return capped;
    }

    public void setCapped(boolean capped) {
        this.capped = capped;
    }

    private boolean capped = false;
}

