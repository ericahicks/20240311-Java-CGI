package com.skillstorm.abstraction;

import com.skillstorm.polymorphism.Person;

public interface Driveable {
    /* always has modifiers: public static final */ 
    int x = 1;
    void drive();
}

interface Washable {
    int x = 100;
    void wash();
}

// implementing classes should go in a different file
// for demo purposes, here are some implementing classes

class Car implements Driveable, Washable {

    @Override
    public void drive() {
        System.out.println("vroom vroom");
    }

    @Override
    public void wash() {
        System.out.println("scrub a dub dub");
    }

}

class Train implements Driveable {

    public static final int x = 20; // shadow 

    @Override
    public void drive() {
        System.out.println("Choo choo");
        // x = 30; // x is final because all interface 
        System.out.println("Driving distance of " + x);
    }
    
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.travel(new Train());
        System.out.println("Driveable x = " + Driveable.x);
        System.out.println("Train x = " + Train.x);
        // System.out.println("Car x = " + Car.x); // The field Car.x is ambiguous
        Car c = new Car();
        c.drive();
        System.out.println("Washable x = " + Washable.x);
    }
}