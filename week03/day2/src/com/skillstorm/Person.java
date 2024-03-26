package com.skillstorm;

public class Person {
    public static long population = 70_000_000_000L; // belongs to the class
    
    public String name = "unknown"; // instance property belongs to object

    public Person(String name) {
        this.name = name;
        population += 1;
    }

    @Override
    public String toString() {
        return "Person: " + this.name + " (population = " + 
                population + ")";
    }

    // static methods
    public static void viewPopulation() {
        System.out.printf("%,d people", Person.population);
    }

    // instance methods
    public String getName() {
        // capitalize the first letter
        // return the value
        return this.name.substring(0, 1).toUpperCase() +
                this.name.substring(1).toLowerCase();
    }
}
