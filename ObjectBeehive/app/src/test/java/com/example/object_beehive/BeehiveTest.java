package com.example.object_beehive;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeehiveTest {

    @Test
    public void getHeight() {
        double hiveHeight = 2.5;
        Beehive instance = new Beehive(hiveHeight);
        assertEquals(hiveHeight, instance.getHeight(), 0.0);
    }

    @Test
    public void isDry() {
    }

    @Test
    public void getHoneyLevel() {
    }

    @Test
    public void setHoneyLevel() {
    }
}