package com.skillstorm.polymorphism;

import com.skillstorm.abstraction.Driveable;

public class Person {

    static void cut() {
        System.out.println("Cutting");
    }

    public void travel(Driveable vehicle) {
        vehicle.drive();
    }

}

// Example sub classes 
class Surgeon extends Person {
    
    public static void cut() {
        System.out.println("Making incision");
    }
}

class Main {
    public static void main(String[] args) {
        Person p = new Surgeon();
        // p.cut(); // cutting or Making incision?
    }
}
