package com.skillstorm.examples.userinput;

import java.util.Scanner;

public class ScannerExamples {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // create a new instance of the Scanner class 
                                             // using the user's keyboard input
        
        // Example 1:
        // Read in a line
        System.out.print("Enter your name: ");
        String name = in.nextLine();

        // Example 2:
        // Read in the next value

        // Example 3
        // Read in a number

        // Example 4
        // Read in a decimal number

        // Example 5
        // Change the delimiter and read in a value

        in.close(); // close the connection
        
    }

}
