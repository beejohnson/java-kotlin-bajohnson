package com.example.classhierarchy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApiaryTest {

    @Test(expected = IllegalArgumentException.class)
    public void invalidHeight() {
        double badHiveHeight = -2.5;
        String exceptionMessage = "Invalid height " + badHiveHeight + ". Must be positive.";
        try {
            Apiary instance = new Apiary(badHiveHeight);
        } catch (IllegalArgumentException ex) {
            assertEquals(exceptionMessage, ex.getMessage());
            throw ex;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidHoneyLevel() throws Exception {
        double hiveHeight = 2.1;
        Apiary instance = new Apiary(hiveHeight);
        double invalidHoneyLevel = -1.0;
        instance.setHoneyLevel(invalidHoneyLevel);
    }

    @Test
    public void getHeight(){
        double hiveHeight = 2.1;
        Apiary instance = new Apiary(hiveHeight);
        assertEquals("testing bad hive.",hiveHeight, instance.getHeight(),0.0);
    }

    @Test
    public void emptyCombTrue() {
        double hiveHeight = 2.1;
        Apiary instance = new Apiary(hiveHeight);
        assertEquals(true, instance.emptyComb());
    }

    @Test
    public void emptyCombFalse() {
        double hiveHeight = 2.1;
        Apiary instance = new Apiary(hiveHeight);
        double honeylevel = 0.0;
        instance.setHoneyLevel(honeylevel);
        assertEquals(true, instance.emptyComb());
    }

    @Test
    public void getHoneyLevel() {
        double hiveHeight = 2.1;
        Apiary instance = new Apiary(hiveHeight);
        assertEquals(0.0, instance.getHoneyLevel(), 0.0);
    }

    @Test
    public void makeHeightandLevelApiary() {
        double height = 3.5;
        double level = 1.5;
        Apiary instance = new Apiary(height, level);
        assertEquals(height, instance.getHeight(), 0.0);
        assertEquals(level, instance.getLevel(), 0.0);
    }

    @Test
    public void setHoneyLevel() {
        double hiveHeight = 3.5;
        Apiary instance = new Apiary(hiveHeight);
        assertEquals(0.0, instance.getHoneyLevel(), 0.0);
        double newHoneyLevel = 1.0;
        instance.setHoneyLevel(newHoneyLevel);
        assertEquals(newHoneyLevel, instance.getHoneyLevel(), 0.0);
    }

   /* @Test
    public void graynotoxin() {
        double height = 2.1;
        Apiary instance = new Apiary(height);
        double honeyLevel = 1.0;
        assertEquals(false, instance.Graynotoxin(true));
        instance.Graynotoxin(true);
        assertEquals(true, instance.Graynotoxin(true));
    }*/

    void makeBadHive() {
        Apiary bad = new Apiary(-3.2);
        System.out.println("Hive Height is " + bad.getHeight());
    }

    @Test(expected = IllegalArgumentException.class)
    public void showCatchingException() {
        makeBadHive();
    }
}