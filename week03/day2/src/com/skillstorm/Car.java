package com.skillstorm;

public class Car {

    String make;
    String model;
    int year;
    static int gasTankGallons = 10;
    int gasInTank = 0;

    public Car() {
        this.make = "Range Rover";
        this.model = "Evoke";
        this.year = 2020;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    /*
     * static methods - do not have access to instance properties
     * instance methods - have access to both instance and static properties
     */
    public String toString() {
        return "Car: " + make + " " + this.model + " " + this.year + " (Currently has " + this.gasInTank + " gallons, Capacity " + gasTankGallons + " gallons)";
    }

    


    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Jeep", "Rangler", 2024);
        System.out.println(car1.toString());
        System.out.println(car2);
    }

}
