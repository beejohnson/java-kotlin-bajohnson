package com.example.beehivecollections;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class LocationTest {

    @Test
    public void getHiveX() {
        Location loc = new Location("a", 1.0, 1.5);
        assertEquals(loc.getHiveX(), 1.0, 0.0);
    }

    @Test
    public void getHiveY() {
        Location loc = new Location("a", 1.0, 1.5);
        assertEquals(loc.getHiveY(), 1.5, 0.0);
    }

    @Test
    public void getName() {
        Location loc = new Location("a", 1.0, 1.5);
        assertEquals(loc.getName(), "a");
    }

    @Test
    public void normalAxis() {
    }

    @Test
    public void compareTo() {
        ArrayList< Location > a = new ArrayList<>();
        a.add(new Location("a", 1,1));
        a.add(new Location("a",1,1));
        a.add(new Location("b",0,0));
        a.add(new Location("b",1,-1));

        for (int i=0; i<a.size(); ++i) {
            assertEquals(0, a.get(i).compareTo(a.get(i)));
            for (int j=i+1; j<a.size(); ++j) {
                assertTrue(a.get(i).compareTo(a.get(j)) < 0);
                assertTrue(a.get(j).compareTo(a.get(i)) > 0);
            }
        }
    }


    Location HiveOne() {
        String name = "HiveOne";
        double x = 1;
        double y = 2;
        Location loc = new Location(name, x, y);
        return loc;
    }


    Location HiveTwo() {
        String name = "HiveTwo";
        double x = 2;
        double y = 1;
        Location loc = new Location(name, x, y);
        return loc;
    }

    @Test
    public void metersTo() {
        ArrayList< Location > a = new ArrayList<>();
        a.add(new Location("a", 1, 2));
        a.add(new Location("a", 2, 1));
        a.add(new Location("b", 0, 0));
        a.add(new Location( "b", 1, -1));
        a.add(HiveOne());
        a.add(HiveTwo());

        for (int i = 0; i < a.size(); ++i) {
            assertEquals(0.0,a.get(i).metersTo(a.get(i)), 1);
            for (int j = 0; j < a.size(); ++j) {
                assertEquals(a.get(i).metersTo(a.get(j)), 1);
            }
        }
    }



    @Test
    public void testHashCode() {
    }




}


















