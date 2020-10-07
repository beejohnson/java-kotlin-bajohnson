package com.example.beehivecollections;

public interface Hive {
    double getHeight();

    void setHeight(double depth);

    double getLevel();

    void setLevel(double level);

    default boolean isEmpty() {
        return getLevel() <= 0.0;
    }

    String getOwner();

    void setOwner(String owner);
}