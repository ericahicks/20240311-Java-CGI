package com.skillstorm.examples.datatypes;

public class StringExamples {

    public static void main(String[] args) {
        // Concatenation of Strings with other data types
        // Example 1:
        // Order of Operations matters
        System.out.println(("1 + 1 = " + 1) + 1); // String + number = String
        System.out.println("1 + 1 = " + (1 + 1));

        // Example 2:
        // Adding data of different types
        // String + int = String + String = String
        // double + int = double + double = double
        double result = 1.99 + 1;
        // short + short = int
        // byte + byte = int
        // byte + short = int
        short a = 1; // doesn't default to int for number literals
        short b = 2;
        // short c = a + b; // cannot store int in a short because short is 16bits and int is 32bits

        // Example 3:
        // To add newline characters in a String use the special character \n
        String poem = "Roses are red, \n" 
        + "violets are blue, \n"
        + "today is\nTueday\n";
        int answer = 1 + 1 + 1 + 10;
        System.out.println(poem);
    }

}
