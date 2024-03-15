package com.skillstorm; // lowercase for packages

import java.util.Scanner;

public class Homework { // upercase for class names

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the initial principle invested: ");
        double principal = in.nextDouble();
        System.out.print("Please enter the interest rate as a percent: ");
        double rate = in.nextDouble();
        double rateAsDecimal = rate / 100;
        System.out.print("Please enter the initial time period in years: ");
        double time = in.nextDouble();
        // Calculation
        // double interestAccrued = principal(1 + rate*time); // must specify * sign
        double interestAccrued = principal * (1 + rateAsDecimal * time);
        System.out.printf("Your principal plus interst accured is %.2f", interestAccrued);

        


        in.close();
    }

}
