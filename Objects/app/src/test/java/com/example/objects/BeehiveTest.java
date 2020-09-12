package com.example.objects;

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
        double hiveHeight = 2.5;
        Beehive instance = new Beehive(hiveHeight);
        assertTrue(instance.isDry());
    }

    @Test
    public void getHoneyLevel() {

            double hiveHeight = 2.5;
            Beehive instance = new Beehive(hiveHeight);
            assertEquals(0.0, instance.getHoneyLevel(), 0.0);
        }


    @Test
    public void setHoneyLevel() {
        double hiveHeight = 2.5;
        Beehive instance = new Beehive(hiveHeight);
        assertEquals(0.0, instance.getHoneyLevel(), 0.0);
        double newHoneyLevel = 1;
        instance.setHoneyLevel(newHoneyLevel);
        assertEquals(newHoneyLevel, instance.getHoneyLevel(), 0.0);    }

    @Test
    public void Poisoned() {
        double hiveHeight = 2.5;
        Beehive instance = new Beehive(hiveHeight);
        double HoneyLevel = 1;
        assertFalse(instance.isPoisoned());
        instance.setPoisoned(true);
        assertTrue(instance.isPoisoned());
    }


}