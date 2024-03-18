package com.skillstorm;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to the calculator app! What would you like to do?");
        System.out.println("a - add\n"
                + "s - subtract\n"
                + "m - multiple\n"
                + "d - divide\n"
                + "f - convert °C to °F\n"
                + "c - converte °F to °C");
        String choice = scanner.nextLine();
        // String matching best practices - trim user input, make all lowercase or
        // ignore case
        choice = choice.trim().toLowerCase();
        int result = 0;
        int value1, value2;
        value1 = getNumberFromUser(scanner);
        if (choice.equals("a")) { // better way to compare Strings
            // Prompt user for two numbers
            value2 = getNumberFromUser(scanner);
            // doSomething(); // to invoke a method don't forget the parenthesis
            // Calculate result
            result = Calculator.add(value1, value2);
        } else if (choice.equals("s")) {
            value2 = getNumberFromUser(scanner);
            result = Calculator.subtract(value1, value2);
        } else if (choice.equals("m")) {
            value2 = getNumberFromUser(scanner);
            result = Calculator.multiply(value1, value2);
        } else if (choice.equals("d")) {
            value2 = getNumberFromUser(scanner);
            result = Calculator.divide(value1, value2);
        } else if (choice.equals("f")) {
            result = Calculator.convertCtoF(value1);
        } else if (choice.equals("c")) {
            result = Calculator.convertFtoC(value1);
        } else {
            System.out.printf("%s is not a valid choice.%n", choice);
        }
        System.out.println("Result is " + result);
        scanner.close();
    }

    // Prompt for number
    public static int getNumberFromUser(Scanner scanner) {
        System.out.print("Enter a whole number: ");
        return scanner.nextInt();
    }

    // stub method - does not do anything yet, but compiles and returns "dummy
    // value"
    public static int doSomething() {
        return 0;
    }

}
