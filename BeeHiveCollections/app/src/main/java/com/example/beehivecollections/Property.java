package com.example.beehivecollections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Property {
    private Map<Location, BeeHive> beehives = new TreeMap<Location, BeeHive>();
    private Map<Location, Apiary> apiaries = new TreeMap<Location, Apiary>();

    private List<String> owners = new ArrayList<String> (100);

    private List<Byte> privateKeySignature = new ArrayList<Byte> (256);
    void boolEx() {
        ArrayList < Boolean > yns = new ArrayList<>();
        yns.add(Boolean.valueOf(true));
        yns.add(new Boolean(true));
        yns.add(new Boolean(false));
        yns.add(new Boolean(true));
        yns.add(new Boolean(true));
    }

    public void addToKeySignature(byte value) {
        privateKeySignature.add(value);
        privateKeySignature.add(Byte.valueOf(value));

        byte thirdValue = privateKeySignature.get(2);
        byte thirdValueLonghandWay = ((Byte) (Object) privateKeySignature.get(2)).byteValue();
        privateKeySignature.sort((a,b) -> a-b);
        privateKeySignature.sort((a,b)->a.compareTo(b));
        List<String> lines = Arrays.asList("spring", "node", "mkyong");

        lines.parallelStream().filter(p->p.endsWith("g")).forEachOrdered(System.out::println);

        List<String> result = lines.parallelStream()
                .filter(line -> !"mkyong".equals(line))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    public void addBeeHiveAt(Location at, BeeHive beeHive) {
        beehives.put(at, beeHive);
    }

    public void addApiaryAt(Location at, Apiary apiary) {
        apiaries.put(at, apiary);
    }

    public Set<Location> getBeeHiveLocations() {
        return beehives.keySet();
    }

    public Set<Location> getApiaryLocations() {
        return apiaries.keySet();
    }

    public BeeHive getBeeHiveAt(Location at) {
        return beehives.get(at);
    }

    public Apiary getApiaryAt(Location at) {
        return apiaries.get(at);
    }

    public Set<Location> ApiaryInMeters(Location center, double cutOffInMeters){
        TreeSet<Location> nearby = new TreeSet<Location>();
        Location.addLocationInMeters(nearby, center, cutOffInMeters, apiaries.keySet());
        return nearby;
    }

    public Set<Location> BeeHiveInMeters(Location center, double cutOffInMeters) {
        TreeSet<Location> nearby = new TreeSet<Location>();
        Location.addLocationInMeters(nearby, center, cutOffInMeters, beehives.keySet());
        return nearby;
    }

}

























