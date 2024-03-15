package com.skillstorm;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // ask for a users name if they do let them play the number guessing game
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();
        // Notice this numberGenerator object is never used if the name is empty, 
        // To OPTIMIZE MEMORY move this to inside the code block where it is used
        Random randomGenerator = new Random(); 
        randomGenerator.nextInt(10);
        int secretNumber = randomGenerator.nextInt(100) + 1; // offset changes range from 0 to 99 inclusive to 1 to 100
                                                             // inclusive
        // check name isn't null and isn't empty
        if (name != null && name.length() > 0) {
            System.out.println("Welcome, " + name);
            System.out.println("Let's play the guessing game.");
            System.out.print("Guess a whole number between 1 and 100: ");
            int guess = in.nextInt();
            // Nested if-else
            // indent one level
            // prettify code with ALT-SHIFT-F
            if (secretNumber == guess) {
                System.out.println("You won!");
            } else {
                System.out.println("Sorry you lost, the number was " + secretNumber);
            }
        } else {
            System.out.println("Sorry, you must enter a player name. Come back later to play once you have a name.");
        }
        in.close();
    }
    
}
