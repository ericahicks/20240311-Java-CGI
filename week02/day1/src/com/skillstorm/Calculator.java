package com.skillstorm;

public class Calculator {

    static int x = 100;
    static int y = 200;

    // Example1 Calculator Class
    public static void main(String[] args) {
        int x = 10;
        System.out.println("add(1,2)=" + add(1,2));
        System.out.println("x="+x); // 10 or 1? 10
        System.out.println("y="+y); // 2 or 200? 200
        System.out.println("y="+Calculator.y); // more readable use class name to refer to class variables
    }

    // add
    public static int add(int x, int y) {
        System.out.println("x="+x);
        System.out.println("y="+y);
        return x + y;
    }

    // subtract
    // stub methods - don't write teh coce yet, just the method signature
    // (to make the code compile you can add a return statement with
    // dummy data)
    public static int subtract(int a, int b) {
        return a - b;
    }

    // divide 
    public static int divide(int a, int b) {
        return a / b;
    }

    // multiply
    public static int multiply(int a, int b) {
        return a * b;
    }

    // convert degF to degC
    // use the formula, °C = (°F - 32) × 5/9
    public static int convertFtoC(int tempInDegF) {
        return (int) ((tempInDegF - 32) * (5.0 / 9.0));
    }

    // converte degC to degF
    // (°C x 9/5) + 32 
    public static int convertCtoF(int tempInDegC) {
        return (int) ((tempInDegC * (9.0 / 5.0)) + 32);
    }
}
