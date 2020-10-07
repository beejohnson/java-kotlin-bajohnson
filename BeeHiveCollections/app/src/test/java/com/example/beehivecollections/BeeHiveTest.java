package com.example.beehivecollections;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeeHiveTest {

    @Test
    public void HoneyLevel() {
        BeeHive instance = new BeeHive(4.0);
        assertEquals(0.0, instance.getHoneyLevel(),0.0);
        instance.setHoneyLevel(4.0);
        assertEquals(4.0, instance.getHoneyLevel(),0.0);
    }


    @Test
    public void isCapped() {
        BeeHive instance = new BeeHive(4.0);
        assertFalse(instance.isCapped());
        instance.setCapped(true);
        assertTrue(instance.isCapped());
    }

    @Test
    public void setCapped() {
        double height = 4.0;
        double level = 2.1;
        BeeHive instance = new BeeHive(height, level);
        assertEquals(height, instance.getHeight(),0.0);
        assertEquals(level, instance.getLevel(),0.0);
    }
}