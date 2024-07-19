//Write a Java program to check whether a given string ends with another string.
package com.classdemo;

public class CheckEndsWith {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String suffix1 = "World!";
        String suffix2 = "Java";

        // Using endsWith() method to check if originalString ends with suffix1
        boolean endsWithSuffix1 = originalString.endsWith(suffix1);

        // Check if originalString ends with suffix1
        if (endsWithSuffix1) {
            System.out.println("The string ends with '" + suffix1 + "'");
        } else {
            System.out.println("The string does not end with '" + suffix1 + "'");
        }

        // Using endsWith() method to check if originalString ends with suffix2
        boolean endsWithSuffix2 = originalString.endsWith(suffix2);

        // Check if originalString ends with suffix2
        if (endsWithSuffix2) {
            System.out.println("The string ends with '" + suffix2 + "'");
        } else {
            System.out.println("The string does not end with '" + suffix2 + "'");
        }
    }
}

/*
Dry Run:

1. The main method is invoked.
2. The original string `originalString` is assigned the value "Hello, World!".
3. Two suffixes, `suffix1` and `suffix2`, are defined as "World!" and "Java" respectively.
4. Using endsWith() method to check if `originalString` ends with `suffix1`:
   - originalString.endsWith(suffix1) is evaluated.
   - Since "Hello, World!" ends with "World!", endsWithSuffix1 is true.
   - "The string ends with 'World!'" is printed.
5. Using endsWith() method to check if `originalString` ends with `suffix2`:
   - originalString.endsWith(suffix2) is evaluated.
   - Since "Hello, World!" does not end with "Java", endsWithSuffix2 is false.
   - "The string does not end with 'Java'" is printed.

Expected Output:
The string ends with 'World!'
The string does not end with 'Java'
*/
