package com.skillstorm.examples.userinput;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        // You can declare all your variables up-front at the top of the method
        double income, rent, utilities, insurance, expenses, savings;

        Scanner in = new Scanner(System.in); // create a new instance of the Scanner class 
                                             // using the user's keyboard input
        System.out.println("Welcome to the Savings Calculator!");

        // Prompt the user to enter their monthly income 
        System.out.println("How much do you make a month?");
        income = in.nextDouble(); // non-static methods are called with the name of an instance

        // Prompt the user to enter their expenses.
        System.out.println("How much is your rent monthly?");
        rent = in.nextDouble();
        System.out.println("How much is your utility bill monthly?");
        utilities = in.nextDouble();
        System.out.println("How much is your car insurance monthly?");
        insurance = in.nextDouble();

        // Calculate total expenses and suggested savings
        expenses = rent + utilities + insurance;
        System.out.println("Your total expenses are: $" + expenses);

        // savings calculated assuming half of what's leftover after expenses should be saved
        savings = (income - expenses) / 2;
        System.out.println("You should consider saving: $" + savings + " a month");
        in.close(); // release the memory resource that Java opened
    }

}
