package com.classdemo;

public class CreateStringFromArray {
    public static void main(String[] args) {
        // Create a character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        
        // Create a String from the character array
        String str = new String(charArray);
        
        System.out.println("String created from character array: " + str);
    }
}

