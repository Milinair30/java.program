package com.classdemo;

import java.util.LinkedList;

public class LinkedListOccurences {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(5);

        int elementToFind = 2;

        // Find the first occurence
        int firstIndex = linkedList.indexOf(elementToFind);

        // Find the last occurrence
        int lastIndex = linkedList.lastIndexOf(elementToFind);

        if (firstIndex != -1) {
            System.out.println("First occurrence of " + elementToFind + " at index: " + firstIndex);
        } else {
            System.out.println("Element " + elementToFind + " not found in the list.");
        }

        if (lastIndex != -1) {
            System.out.println("Last occurrence of " + elementToFind + " at index: " + lastIndex);
        } else {
            System.out.println("Element " + elementToFind + " not found in the list.");
        }
    }
}
