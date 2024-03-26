package com.skillstorm;

public class Person {
    public static int population = 0; // belongs to the class
    
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

    // instance methods
    public String getName() {
        // capitalize the first letter
        // return the value
        return this.name.substring(0, 1).toUpperCase() +
                this.name.substring(1).toLowerCase();
    }
}
