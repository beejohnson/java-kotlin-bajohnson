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
    public int compareTo(Location other) {
        int cmp;
        cmp = this.name.compareTo(other.name);
        if (cmp != 0) {
            return cmp;
        }
        cmp = (this.longitude < other.longitude) ? -1 : (this.longitude > other.longitude) ? 1 : 0; //? 1 : 0 is short hand if
        if (cmp != 0) {
            return cmp;
        }
        cmp = (this.latitude < other.latitude) ? -1 : (this.latitude > other.latitude) ? 1 : 0;
        if (cmp != 0) {
            return cmp;
        }
        return 0; //you need to define the idea of less than
    }
    @Override
    public int hashCode() {
        return 7 * name.hashCode() + 13 * Double.hashCode(this.longitude) + 17 * Double.hashCode(this.latitude);

    }
}
