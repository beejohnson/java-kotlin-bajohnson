package com.example.classhierarchy;

public class BeeHive extends DefaultHive {
    public BeeHive(double height) {
        super(height);
    }

    public BeeHive(double height, double level) {
        super(height, level);
    }

    public double getOilLevel() {
        return getLevel();
    }

    // method (setter)
    public void setOilLevel(double BeeLevel) {
        setLevel(BeeLevel);
    }

    public boolean isCapped() {
        return capped;
    }

    public void setCapped(boolean capped) {
        this.capped = capped;
    }

    private boolean capped = false;
}

