//Write a Java program to sort a given array list.
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
        
        // Print the ArrayList before sorting
        System.out.println("ArrayList before sorting: " + arrayList);
        
        // Sort the ArrayList
        Collections.sort(arrayList);
        
        // Print the ArrayList after sorting
        System.out.println("ArrayList after sorting: " + arrayList);
    }
}

/*
Dry Run:

1. Create an empty ArrayList of integers named 'arrayList'.
2. Add elements to the 'arrayList':
    a. arrayList.add(5) -> [5]
    b. arrayList.add(2) -> [5, 2]
    c. arrayList.add(9) -> [5, 2, 9]
    d. arrayList.add(1) -> [5, 2, 9, 1]
    e. arrayList.add(7) -> [5, 2, 9, 1, 7]
3. Print the ArrayList before sorting:
    Output: "ArrayList before sorting: [5, 2, 9, 1, 7]"
4. Sort the ArrayList using Collections.sort(arrayList):
    - The sort operation rearranges the elements in ascending order.
    - The sorted ArrayList is [1, 2, 5, 7, 9].
5. Print the ArrayList after sorting:
    Output: "ArrayList after sorting: [1, 2, 5, 7, 9]"

Final Output:
ArrayList before sorting: [5, 2, 9, 1, 7]
ArrayList after sorting: [1, 2, 5, 7, 9]
*/