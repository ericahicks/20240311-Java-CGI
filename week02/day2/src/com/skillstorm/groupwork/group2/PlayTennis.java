package com.skillstorm.groupwork.group2;

import java.util.Scanner;

/** 
 * Group work
 * @author Ayola and Sonia
 */
public class PlayTennis {

     public static void main(String[] args) {
        System.out.println("Welcome to the program for deciding if you");
        System.out.println("Should Play Tennis Today\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's look at the weather conditions.\n");
        if (PlayTennis.isWeatherGood(scanner)) {
            System.out.println("Yes! Today is a great day to play tennis.");
        } else {
            System.out.println("No, today is not good tennis weather. Maybe go bowling.");
        }
        scanner.close();
    } // end main

    // this will check to see if the weather is good enough to play tennis
    public static boolean isWeatherGood(Scanner scanner) {
        // Ask user how weather is
        System.out.println("Is it raining today? Yes or no?");
        String rainy = scanner.nextLine();
        if (rainy.equalsIgnoreCase("yes")) {
            return false;
        } else {
            System.out.println("Is it windy today? Yes or no?");
            String windy = scanner.nextLine();
            // if (windy.equalsIgnoreCase("yes")) {
            //     return false;
            // } else {
            //     return true;
            // }
            return !(windy.equalsIgnoreCase("yes"));
        } 
    
    } // end method 
} // end class
