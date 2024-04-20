package com.classdemo;

public class StringCompareToSequence {
    public static void main(String[] args) {
        String originalString = "Hello";
        String sequenceToCompare = "Hello";
        
        // Using equals() method
        boolean isEqual1 = originalString.equals(sequenceToCompare);
        
        if (isEqual1) {
            System.out.println("The string is equal to the sequence '" + sequenceToCompare + "'");
        } else {
            System.out.println("The string is not equal to the sequence '" + sequenceToCompare + "'");
        }
        
        // Using compareTo() method
        int comparisonResult = originalString.compareTo(sequenceToCompare);
        boolean isEqual2 = comparisonResult == 0;
        
        if (isEqual2) {
            System.out.println("The string is equal to the sequence '" + sequenceToCompare + "'");
        } else {
            System.out.println("The string is not equal to the sequence '" + sequenceToCompare + "'");
        }
    }
}
