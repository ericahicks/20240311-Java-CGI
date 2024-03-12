package com.skillstorm.examples.variables; // reverse domain name for packages

public class Declarations { // capitalize class names

    // I can store data and methods in my class
    // static - means it belongs to the class
    static int x; // default access is only classes inside the same package can use this
    public static int y;
    // methods
    /*
     * public - access modifier that means anyone can use this
     * static - means this belongs to the class
     * void - no data returned
     * main - name
     * String[] - data type of input
     * args - name of parameter
     */
    public static void main(String[] args) { // parameters must have data type and name just like variable declarations
        System.out.println("Good morning, "); // + args[0]); // println adds a line return after printing the String
        System.out.println("Today is awesome!");
        System.out.println(x);

        // 3 Ways to Declare and Initialize variables
        // Declaration
        int z;
        z = 3;

        // Declare and initialize in one step
        int a = 123;

        // Multiple variables of the same type
        int b, c, d;
        b = 2;
        c = 3;
        d = 10000;

        // multilpe variables of same types
        int e = 5, f = 6;
    }

    // other methods 
    public static void doStuff(){
        System.out.println("x is " + x);
    }

}