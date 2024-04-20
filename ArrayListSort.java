package com.classdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // Add elements to the ArrayList
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(7);
        
        System.out.println("ArrayList before sorting: " + arrayList);
        Collections.sort(arrayList);
       
        System.out.println("ArrayList after sorting: " + arrayList);
    }
}

