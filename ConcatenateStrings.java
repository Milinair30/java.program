package com.classdemo;

public class ConcatenateStrings {
    public static void main(String[] args) {
        String originalString = "Hello, ";
        String stringToConcatenate = "world!";
        
        
        String concatenatedString1 = originalString.concat(stringToConcatenate);
        System.out.println("Concatenated String 1: " + concatenatedString1);
        
        // Using the + operator
        String concatenatedString2 = originalString + stringToConcatenate;
        System.out.println("Concatenated String 2: " + concatenatedString2);
    }
}

