package com.classdemo;
public class GetCharacterAtIndex {

    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 7; // Index to get the character from

        char result = getCharacterAtIndex(str, index);

        if (result != '\0') {
            System.out.println("Character at index " + index + " is: " + result);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public static char getCharacterAtIndex(String str, int index) {
        // Check if index is within bounds
        if (index >= 0 && index < str.length()) {
            return str.charAt(index);
        } else {
            return '\0'; 
        }
    }
}
