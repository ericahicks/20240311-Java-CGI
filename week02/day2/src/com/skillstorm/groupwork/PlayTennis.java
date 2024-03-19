package com.skillstorm.groupwork;

import java.util.Scanner;

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

   }

    public static boolean isWeatherGood(Scanner scanner) {
        // Prompt for Outlook
       System.out.println("What is the outlook? (sunny, overcast, windy)");
       String outlook = scanner.nextLine();
        // Check if Sunny, Overcast, Windy
        if (outlook.trim().equalsIgnoreCase("sunny")) {
           // check humidity
           System.out.println("Is the humidity high or low?");
           String humidity = scanner.nextLine();
        //    if (humidity.trim().equalsIgnoreCase("low")) {
        //        return true;
        //    } else {
        //        return false;
        //    }
            return humidity.trim().equalsIgnoreCase("low");
        } 
        if (outlook.trim().equalsIgnoreCase("overcast")) {
           // return true
           return true;
        }
        if (outlook.trim().equalsIgnoreCase("windy")) {
           // check high or low
           System.out.println("Is the wind speed high or low?");
           String wind = scanner.nextLine();
        //    if (wind.trim().equalsIgnoreCase("low")) {
        //        return true;
        //    } else {
        //        return false;
        //    }
            return wind.trim().equalsIgnoreCase("low");
        }

        return false; // default
    }
    
}
