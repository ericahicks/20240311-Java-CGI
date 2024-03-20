package com.skillstorm;

import java.util.Scanner;

public class Review {

    // What happens when we click run?
   

    // public String sayHi() {
    //     return "Hello";
    // }

    public static void jump() {
        System.out.println("How high?");
    }

    public static void main(String[] args) {
        System.out.println("> Start of main method");
        
        Scanner scanner = new Scanner(System.in);
        // Review myReviewInstance = new Review();
        // myReviewInstance.sayHi();
        // Review.sayHi();
        walk();
        walk(scanner); // dynamically decides the distance
        walk(10); // hardcoded the distance
        jump();
        jump(6, "inches");
        jump("right", 2);
        scanner.close();
        System.out.println("> End of main method");
    }

    public static void walk() {
        System.out.println("How far?");
    }

    public static void walk(Scanner scanner) {
        // System.out.println("How far?");
        walk(); // what does this do to the call stack?
        int distance = scanner.nextInt();
        // System.out.println("Walking " + distance + " miles");
        walk(distance); // pass along the value we read in
    }

    // Method overloading - methods can have the same name but must have different parameter types
    public static void walk(int distance) { // gets assigned the argument passed in when the method is called
        System.out.println("Walking " + distance + " miles");
    }

    public static void jump(int height, String unit) {
        System.out.printf("Jumping %d %s%n", height, unit);
    }

    public static void jump(String direction, int distance) {
        String unit = "feet";
        // use "foot" instead when the distance is 1
        // what logic statement should I use?
        if (distance == 1) {
            unit = "foot";
        }
        System.out.printf("Jumping %d %s to the %s%n", distance, unit, direction);
    }
    
}
