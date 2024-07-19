//Write a Java program to concatenate a given string to the end of another string.
package com.classdemo;

// Class to demonstrate concatenating strings in Java
public class ConcatenateStrings {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello, ";
        // String to concatenate
        String stringToConcatenate = "world!";
        
        // Concatenation using the concat() method
        String concatenatedString1 = originalString.concat(stringToConcatenate);
        System.out.println("Concatenated String 1: " + concatenatedString1);
        
        // Concatenation using the + operator
        String concatenatedString2 = originalString + stringToConcatenate;
        System.out.println("Concatenated String 2: " + concatenatedString2);
    }
}


/*
Dry Run:

1. The main method is invoked.
2. The originalString variable is assigned the value "Hello, ".
3. The stringToConcatenate variable is assigned the value "world!".
4. Concatenation using the concat() method:
   - The concat method appends the stringToConcatenate to the end of originalString.
   - The concatenated result is stored in concatenatedString1.
   - "Concatenated String 1: Hello, world!" is printed.
5. Concatenation using the + operator:
   - originalString + stringToConcatenate is evaluated.
   - The + operator concatenates the two strings, originalString followed by stringToConcatenate.
   - The concatenated result is stored in concatenatedString2.
   - "Concatenated String 2: Hello, world!" is printed.

Expected Output:
Concatenated String 1: Hello, world!
Concatenated String 2: Hello, world!
*/