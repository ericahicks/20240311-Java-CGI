package com.skillstorm;

import java.util.Scanner;

public class BooleanExamples {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        if (age >= 18) {
            System.out.println("You can register to vote!");
            System.out.println("Here's an application.");
            System.out.println("It's an election year!");
        } else {
        // if (age < 18) {
            System.out.println("Sorry, you cannot vote.");
            System.out.println("Do you want to volunteer at our event?");
        }
        in.close();
    }
    
}
