package com.skillstorm.groupwork.group1;

import java.util.Scanner;

/**
 * Groupwork
 * 
 * @author Stephen and Michael
 */
public class PlayTennis {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("Welcome to the program for deciding if you");
        System.out.println("Should Play Tennis Today\n");

        // new scanner instacer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's look at the weather conditions.\n");

        // compare input to condition
        if (PlayTennis.isWeatherGood(scanner)) {
            System.out.println("Yes! Today is a great day to play tennis.");
        } else {
            System.out.println("No, today is not good tennis weather. Maybe go bowling.");
        }

        scanner.close();

    }

    // helper method
    public static boolean isWeatherGood(Scanner scanner) {
        // prompt user
        System.out.println("Is it sunny, overcast, or raining?");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("sunny")) {
            System.out.println("Is the Humidity high?");
            String humidity = scanner.nextLine();
            // if (humidity.equalsIgnoreCase("yes")) {
            // return false;
            // }
            return !(humidity.equalsIgnoreCase("yes"));
        }

        if (response.equalsIgnoreCase("overcast")) {

            return true;
        }

        if (response.contains("rain")) {
            System.out.println("Is it windy?");
            String wind = scanner.nextLine();
            // if (wind.equalsIgnoreCase("yes")) {
            // return false;

            // }
            return !(wind.equalsIgnoreCase("yes"));

        }
        return false;
    }

}
