package com.example.beehivecollections;

public class DefaultHive implements Hive {
    private double height;

    private static double checkHeight(double height) {
        if (height > 0.0) {
            return height;
        }
        String message = "Invalid height " + height  + "." +
                " Must be positive.";
        throw new IllegalArgumentException(message);
    }
    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = checkHeight(height);
    }

    private double level;
    private static double checkLevel(double level, double height) {
        if (0 <= level && level <= height) {
            return level;
        }
        String message = "Invalid height  " + height + "." +
                " Must be positive.";
        throw new IllegalArgumentException(message);
    }

    @Override
    public double getLevel() {
        return level;
    }

    @Override
    public void setLevel(double level) {
        this.level = checkLevel(level,height);
    }


    private String owner="";
    private String checkOwner(String owner) {
        if (owner != null) {
            return owner;
        }
        String message = "Invalid owner (null).  Must mot be null.";
        throw new IllegalArgumentException(message);
    }
   // @Override
   /* public String getOwner() {
        return owner;
    }

    @Override
    public void setOwner(String owner) {
        this.owner = checkOwner(owner);
    }*/

    public DefaultHive(double height) {
        this.height= checkHeight(height);
        this.level = 0.0;
        this.owner = "";
    }

    public DefaultHive(double height, double level) {
        this.height= checkHeight(height);
        this.level = checkLevel(level, height);
        this.owner = "";
    }
}

