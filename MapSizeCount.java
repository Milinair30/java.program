//Write a Java program to count the number of key-value (size) mappings in a map.

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

/*
Dry Run:

1. Create a HashMap named 'map'.
2. Add key-value pairs to the 'map':
    - map.put("Apple", 10) -> {"Apple": 10}
    - map.put("Banana", 20) -> {"Apple": 10, "Banana": 20}
    - map.put("Orange", 15) -> {"Apple": 10, "Banana": 20, "Orange": 15}
    - map.put("Grape", 12) -> {"Apple": 10, "Banana": 20, "Orange": 15, "Grape": 12}
    - map.put("Mango", 8) -> {"Apple": 10, "Banana": 20, "Orange": 15, "Grape": 12, "Mango": 8}
3. Get the size of the 'map':
    - size = map.size() -> 5
4. Print "Number of key-value mappings in the map: 5".

Output:
Number of key-value mappings in the map: 5
*/