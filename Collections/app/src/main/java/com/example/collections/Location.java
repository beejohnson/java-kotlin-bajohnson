package com.example.collections;

public class Location implements Comparable < Location >{ //comparable to itself
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    private double latitude;
    private double longitude;
    private String name;
    public Location(String name, double longitude, double latitude) {
        this.name=name;
        this.longitude=longitude;
        this.latitude=latitude;
    }

    @Override
    public int compareTo(Location location) {
        return 0;
    }
}
