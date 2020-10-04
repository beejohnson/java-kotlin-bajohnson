package com.example.collections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WaterWellTest {

    @Test(expected = IllegalArgumentException.class)
    public void invalidDepth() {
        double badWellDepth = -35.2;
        String exceptionMessage = "Invalid depth " + badWellDepth + ". Must be positive.";
        try {
            WaterWell instance = new WaterWell(badWellDepth);
        } catch (IllegalArgumentException ex) {
            assertEquals(exceptionMessage, ex.getMessage());
            throw ex;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidWaterLevel() {
        double wellDepth = 35.2;
        WaterWell instance = new WaterWell(wellDepth);
        double invalidWaterLevel = -1.0;
        instance.setWaterLevel(invalidWaterLevel);
    }

    @Test
    public void getDepth() {
        double wellDepth = 35.2;
        WaterWell instance = new WaterWell(wellDepth);
        assertEquals("testing bad well.",wellDepth, instance.getDepth(),0.0);
    }

    @Test
    public void isDryTrue() {
        double wellDepth = 35.2;
        WaterWell instance = new WaterWell(wellDepth);
        assertTrue(instance.isDry());
    }

    @Test
    public void isDryFalse() {
        double wellDepth = 35.2;
        WaterWell instance = new WaterWell(wellDepth);
        double waterLevel = 0.0;
        instance.setWaterLevel(waterLevel);
        assertTrue(instance.isDry());
    }

    @Test
    public void getWaterLevel() {
        double wellDepth = 35.2;
        WaterWell instance = new WaterWell(wellDepth);
        assertEquals(0.0, instance.getWaterLevel(), 0.0);
    }

    @Test
    public void makeDepthAndLevelWell() {
        double depth = 10.0;
        double level = 5.0;
        WaterWell instance = new WaterWell(depth, level);
        assertEquals(depth, instance.getDepth(),0.0);
        assertEquals(level, instance.getLevel(), 0.0);
    }


    @Test
    public void setWaterLevel() {
        double wellDepth = 35.2;
        WaterWell instance = new WaterWell(wellDepth);
        assertEquals(0.0, instance.getWaterLevel(), 0.0);
        double newWaterLevel = 13.5;
        instance.setWaterLevel(newWaterLevel);
        assertEquals(newWaterLevel, instance.getWaterLevel(), 0.0);
    }

    @Test
    public void poisoned() {
        double depth = 35.2;
        WaterWell instance = new WaterWell(depth);
        double waterLevel = 13.5;
        assertFalse(instance.isPoisoned());
        instance.setPoisoned(true);
        assertTrue(instance.isPoisoned());
    }

    void makeABadWell() {
        WaterWell bad = new WaterWell(-3.9);
        System.out.println("Well depth is " + bad.getDepth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void showCatchingException() {
        makeABadWell();
    }
}