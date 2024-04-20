package com.classdemo;

public class CheckEndsWith {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String suffix1 = "World!";
        String suffix2 = "Java";

        // Using endsWith() method
        boolean endsWithSuffix1 = originalString.endsWith(suffix1);
        boolean endsWithSuffix2 = originalString.endsWith(suffix2);

        // Check if originalString ends with suffix1
        if (endsWithSuffix1) {
            System.out.println("The string ends with '" + suffix1 + "'");
        } else {
            System.out.println("The string does not end with '" + suffix1 + "'");
        }

        // Check if originalString ends with suffix2
        if (endsWithSuffix2) {
            System.out.println("The string ends with '" + suffix2 + "'");
        } else {
            System.out.println("The string does not end with '" + suffix2 + "'");
        }
    }
}
