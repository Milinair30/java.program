//Write a Java program to get the first and last occurrence of the specified elements in a linked list.

package com.classdemo;

import java.util.LinkedList;

public class LinkedListOccurences {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(5);

        // Element to find in the LinkedList
        int elementToFind = 2;

        // Find the first occurrence of the element
        int firstIndex = linkedList.indexOf(elementToFind);

        // Find the last occurrence of the element
        int lastIndex = linkedList.lastIndexOf(elementToFind);

        // Print the index of the first occurrence if found
        if (firstIndex != -1) {
            System.out.println("First occurrence of " + elementToFind + " at index: " + firstIndex);
        } else {
            System.out.println("Element " + elementToFind + " not found in the list.");
        }

        // Print the index of the last occurrence if found
        if (lastIndex != -1) {
            System.out.println("Last occurrence of " + elementToFind + " at index: " + lastIndex);
        } else {
            System.out.println("Element " + elementToFind + " not found in the list.");
        }
    }
}

/*
Dry Run:

1. Create a LinkedList named 'linkedList'.
2. Add elements to the 'linkedList':
    - linkedList.add(1) -> [1]
    - linkedList.add(2) -> [1, 2]
    - linkedList.add(3) -> [1, 2, 3]
    - linkedList.add(2) -> [1, 2, 3, 2]
    - linkedList.add(4) -> [1, 2, 3, 2, 4]
    - linkedList.add(2) -> [1, 2, 3, 2, 4, 2]
    - linkedList.add(5) -> [1, 2, 3, 2, 4, 2, 5]
3. Set the elementToFind variable to 2.
4. Find the first occurrence of 2:
    - linkedList.indexOf(2) returns 1.
5. Find the last occurrence of 2:
    - linkedList.lastIndexOf(2) returns 5.
6. Check if the first occurrence was found:
    - Print "First occurrence of 2 at index: 1".
7. Check if the last occurrence was found:
    - Print "Last occurrence of 2 at index: 5".

Output:
First occurrence of 2 at index: 1
Last occurrence of 2 at index: 5
*/