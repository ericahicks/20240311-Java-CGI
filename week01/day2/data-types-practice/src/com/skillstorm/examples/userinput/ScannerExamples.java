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
        System.out.println("Hello, " + name);

        // Example 2:
        // Read in the next value
        
        // in.useDelimiter(",");
        System.out.print("Enter your city and state separated by a space:  ");
        String city = in.next(); // Grabs the next token (by default this is everything up to the first whitespace)
        String state = in.next();
        System.out.println("You live in " + city + ", " + state);

        // Example 5
        // Change the delimiter and read in a value
        // in.useDelimiter(",");

        // Example 3
        // Read in a number
        System.out.print("Enter your zipcode: ");
        
        // Debugging:
        // String nextToken = in.next();
        // System.out.println("The next token was '" + nextToken + "'");

        int zipcode = in.nextInt();
        System.out.println("Thank you, you entered a zipcode of " + zipcode);

        // Example 4
        // Read in a decimal number
        System.out.println("Enter your weight in pounds: ");
        double weight = in.nextDouble();
        System.out.println("Thank you, you entered a weight of " + weight + "lbs");

        

        in.close(); // close the connection
        
    }

}