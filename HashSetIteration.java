package com.classdemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grape");
        hashSet.add("Mango");

        // Iterate through the HashSet using an Iterator
        System.out.println("Iterating through the HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}

