//Write a Java program to test if a given string contains the specified sequence of char values.
package com.classdemo;

// Class to demonstrate comparing strings to a sequence in Java
public class StringCompareToSequence {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello";
        // Sequence to compare
        String sequenceToCompare = "Hello";
        
        // Using equals() method to compare
        boolean isEqual1 = originalString.equals(sequenceToCompare);
        if (isEqual1) {
            System.out.println("The string is equal to the sequence '" + sequenceToCompare + "'");
        } else {
            System.out.println("The string is not equal to the sequence '" + sequenceToCompare + "'");
        }
        
        // Using compareTo() method to compare
        int comparisonResult = originalString.compareTo(sequenceToCompare);
        boolean isEqual2 = comparisonResult == 0;
        if (isEqual2) {
            System.out.println("The string is equal to the sequence '" + sequenceToCompare + "'");
        } else {
            System.out.println("The string is not equal to the sequence '" + sequenceToCompare + "'");
        }
    }
}

/*
Dry Run:

1. The main method is invoked.
2. The originalString variable is assigned the value "Hello".
3. The sequenceToCompare variable is assigned the value "Hello".
4. Using equals() method to compare:
   - originalString.equals(sequenceToCompare) is called.
   - The equals method checks if the content of originalString is equal to sequenceToCompare.
   - Since both strings are identical, isEqual1 is true.
   - "The string is equal to the sequence 'Hello'" is printed.
5. Using compareTo() method to compare:
   - originalString.compareTo(sequenceToCompare) is called.
   - The compareTo method compares the lexicographical order of the two strings.
   - Since both strings are identical, comparisonResult is 0.
   - isEqual2 is true.
   - "The string is equal to the sequence 'Hello'" is printed.

Expected Output:
The string is equal to the sequence 'Hello'
The string is equal to the sequence 'Hello'
*/