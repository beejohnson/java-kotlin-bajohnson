package com.example.classhierarchy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefaultHiveTest {

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void invalidConstructedHeight() {
        double badHiveHeight = 2.5;
        String exceptionMessage = "Invalid height " + badHiveHeight + ". Must be positive.";
        try {
            DefaultHive instance = new DefaultHive(badHiveHeight);
        } catch (java.lang.IllegalArgumentException ex) {
            assertEquals(exceptionMessage, ex.getMessage());
            throw ex;
        }
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void invalidSetHeight() {
        double goodHiveHeight = 3.0;
        double badHiveHeight = 2.5;
        DefaultHive instance = null;
        try {
            instance = new DefaultHive(goodHiveHeight);
        } catch (java.lang.IllegalArgumentException ex) {
            fail(); // construction should pass
        }
        String exceptionMessage = "Invalid height " + badHiveHeight + ". Must be positive.";
        try {
            instance.setHeight(badHiveHeight);
        } catch (java.lang.IllegalArgumentException ex) {
            assertEquals(exceptionMessage, ex.getMessage());
            throw ex;
        }
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void invalidLevel() throws Exception {
        double wellHeight = 3.5;
        DefaultHive instance = new DefaultHive(wellHeight);
        double invalidLevel = -1.0;
        instance.setLevel(invalidLevel);
    }

    @Test //getHeight test?
    public void getHeight() {
        double hiveHeight = 3.5;
        DefaultHive instance = new DefaultHive(hiveHeight);
        assertEquals("Testing", hiveHeight, instance.getHeight(),0.0);
    }

    @Test
    public void setHeight() {
        double hiveHeight = 3.5;
        DefaultHive instance = new DefaultHive(hiveHeight);
        assertEquals(hiveHeight, instance.getHeight(),0.0);
        double newHiveHeight= 3.0;
        instance.setHeight(newHiveHeight);
        assertEquals(newHiveHeight, instance.getHeight(),0.0);
    }

    @Test
    public void getLevel() {
        double hiveHeight = 3.5;
        DefaultHive instance = new DefaultHive(hiveHeight);
        assertEquals(0.0, instance.getLevel(), 0.0);
    }

    @Test
    public void setLevel() {
        double hiveHeight = 5;
        DefaultHive instance = new DefaultHive(hiveHeight);
        assertEquals(0.0, instance.getLevel(), 0.0);
        double newLevel = 4.5;
        instance.setLevel(newLevel);
        assertEquals(newLevel, instance.getLevel(), 0.0);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void owner() {
        double height = 3.5;
        DefaultHive instance = new DefaultHive(height);
        assertEquals("", instance.getOwner());
        instance.setOwner("Bree");
        assertEquals("Bree", instance.getOwner());
        try {
            instance.setOwner("Bob");
            Assert.fail();
        } catch (java.lang.IllegalArgumentException ex) {
            assertEquals("Invalid owner.", ex.getMessage());
            throw ex;
        }
    }

    void makeBadHive() {
        DefaultHive bad = new DefaultHive(-5.3);
        System.out.println("High height is" + bad.getHeight());
    }

    @Test(expected = IllegalArgumentException.class)
    public void showCatchingException() {
        makeBadHive();
    }
}
















