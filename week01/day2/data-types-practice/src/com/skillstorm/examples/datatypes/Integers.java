package com.skillstorm.examples.datatypes;
 // To access the code in different packages use an import

import com.skillstorm.examples.variables.Declarations;
// import java.lang.Integer; 
// import java.lang.*; // automatically imported for us

public class Integers {

    public static void main(String[] args) {
        // System.out.println(Declarations.x); // package private variables are not accessible outside of package
        // System.out.println(Declarations.y); 
        // Declarations.main(new String[]{"Erica", "Hicks" });

        // Integer declarations
        // Printing out the smallest and largest int use the Integer class
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int someValue = Integer.MIN_VALUE + Integer.MAX_VALUE;
        System.out.println(someValue);

        // Integer overflow
        int overflowResult = Integer.MAX_VALUE + 1;
        System.out.println(overflowResult);

        int tooSmallOverflow = Integer.MIN_VALUE - 1;
        System.out.println(tooSmallOverflow);
    }
    
}
