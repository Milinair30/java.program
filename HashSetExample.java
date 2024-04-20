//There are several classes that implement the Set interface in Java's standard library,
//such as HashSet, TreeSet, LinkedHashSet, and more.

//HashSet is a class in Java that implements the Set interface. 
//It is a collection that does not allow duplicate elements, and it uses a hash table
//for its internal storage. 
//This means that it provides constant-time performance for basic operations like adding, 
//removing, and checking for the existence of an element 

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements
        set.add("apple");
        set.add("banana");
        set.add("orange");

        System.out.println("Set: " + set);

        // Removing an element
        set.remove("banana");
        System.out.println("Set after removal: " + set);

        // Checking existence
        System.out.println("Contains 'apple': " + set.contains("apple"));

        // Size
        System.out.println("Size of set: " + set.size());

        // Iterating
        System.out.println("Iterating over set:");
        for (String element : set) {
            System.out.println(element);
        }

        // Clearing the set
        set.clear();
        System.out.println("Set after clear: " + set);
    }
}
