package com.classdemo;
import java.util.HashMap;
import java.util.Map;

public class MapSizeCount {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 15);
        map.put("Grape", 12);
        map.put("Mango", 8);

        // Get the size of the map
        int size = map.size();
        System.out.println("Number of key-value mappings in the map: " + size);
    }
}
