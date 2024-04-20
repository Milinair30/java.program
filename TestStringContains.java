package com.classdemo;

public class TestStringContains {
    public static void main(String[] args) {
        String str = "Hello, world!";
        String sequence1 = "world";
        String sequence2 = "universe";

        
        if (str.contains(sequence1)) {
            System.out.println("String '" + str + "' contains the sequence '" + sequence1 + "'");
        } else {
            System.out.println("String '" + str + "' does not contain the sequence '" + sequence1 + "'");
        }

        
        if (str.contains(sequence2)) {
            System.out.println("String '" + str + "' contains the sequence '" + sequence2 + "'");
        } else {
            System.out.println("String '" + str + "' does not contain the sequence '" + sequence2 + "'");
        }
    }
}

