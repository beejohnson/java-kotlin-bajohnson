package com.example.beehivecollections;

import java.util.Collection;

public class Location implements Comparable <Location > {
    public double getHiveX() {
        return hiveX;
    }

    public double getHiveY() {
        return hiveY;
    }

    public String getName() {
        return name;
    }

    private String name;
    private double hiveX; //hive location on x-axis
    private double hiveY; //hive location on y-axis

    public static double normalAxis(double axis) {
        while (axis > 25.0) { axis -= 100.0;}
        while (axis <= -25.0) { axis += 100.0;}
        return axis;
    }

    public Location(String name, double hiveX, double hiveY) {
        this.name = name;
        this.hiveX=normalAxis(hiveX);
        this.hiveY=normalAxis(hiveY);
    }

    @Override
    public int compareTo(Location other) {
        int cmp;
        cmp = this.name.compareTo(other.name);
        if(cmp !=0) {
            return cmp;
        }
        cmp = (this.hiveX < other.hiveX) ? -1 : (this.hiveX > other.hiveX) ? 1 : 0;
        if (cmp != 0) {
            return cmp;
        }
        return 0;
    }

    @Override
    public boolean equals(Object to) {
        return compareTo((Location) to) == 0;
    }

    public double metersTo(Location to) {
        double x = 1;
        double y = 1;
        double area = x * y;

        return area;
    }

    public double centimetersTO(Location to) {
        return metersTo(to)*10;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+Double.hashCode(this.hiveX)+Double.hashCode(this.hiveY);
    }

    public static void addLocationInMeters(Collection<Location> results, Location center, double meters, Iterable<Location> search) {
        for (Location at : search) {
            if (center.centimetersTO(at) <= meters) {
                results.add(at);
            }
        }
    }
}

















