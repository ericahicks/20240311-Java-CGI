package com.skillstorm;

public class ShortCircuitExamples {

    static String name; // defaults to null
    static boolean alive; // defaults false

    public static void main(String[] args) {

        // If the string is null or empty, don't bother doing the next code
        String str = null;  // placeholder for an object
        // System.out.println(str.toUpperCase()); // Exception in thread "main" java.lang.NullPointerException
        
        // System.out.println("The length of name is " + name.length()); // Exception in thread "main" java.lang.NullPointerException


        // if (name.length() > 0 && name != null) { // throws error
        if (name != null && name.length() > 0) { // guard clause to prevent errors from breaking the program
            System.out.println(name);
        } 

        // OR short circuit example
        int a = 1;
        int b = 2;
        if (++b > 0 || ++a > 0) {
        //   3 > 0
        //    true so short circuit
        // b = 3   still     a = 1
            System.out.println("Good to go");
        }
        System.out.println("a = " + a); // 2
        System.out.println("b = " + b); // 3


        System.out.println("End of main method reached");
    }

}
