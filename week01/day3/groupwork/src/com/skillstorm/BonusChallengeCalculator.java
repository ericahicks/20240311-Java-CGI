package com.skillstorm;

import java.util.Scanner;
import java.lang.Math;

/**
 * This is a grade calculator built during Java Apprenticeship 20240311.
 */
public class BonusChallengeCalculator {

    public static void main(String[] args) {
        System.out.println("\r\n" + //
                        "  .oooooo.                             .o8                                          \n" + //
                        " d8P'  `Y8b                           \"888                                          \r\n" + //
                        "888           oooo d8b  .oooo.    .oooo888   .ooooo.                                \r\n" + //
                        "888           `888\"\"8P `P  )88b  d88' `888  d88' `88b                               \r\n" + //
                        "888     ooooo  888      .oP\"888  888   888  888ooo888                               \r\n" + //
                        "`88.    .88'   888     d8(  888  888   888  888    .o                               \r\n" + //
                        " `Y8bood8P'   d888b    `Y888\"\"8o `Y8bod88P\" `Y8bod8P'                               \r\n" + //
                        "                                                                                    \r\n" + //
                        "                                                                                    \r\n" + //
                        "                                                                                    \r\n" + //
                        "  .oooooo.             oooo            oooo                  .                      \r\n" + //
                        " d8P'  `Y8b            `888            `888                .o8                      \r\n" + //
                        "888           .oooo.    888   .ooooo.   888  oooo  oooo  .o888oo  .ooooo.  oooo d8b \r\n" + //
                        "888          `P  )88b   888  d88' `\"Y8  888  `888  `888    888   d88' `88b `888\"\"8P \r\n" + //
                        "888           .oP\"888   888  888        888   888   888    888   888   888  888     \r\n" + //
                        "`88b    ooo  d8(  888   888  888   .o8  888   888   888    888 . 888   888  888     \r\n" + //
                        " `Y8bood8P'  `Y888\"\"8o o888o `Y8bod8P' o888o  `V88V\"V8P'   \"888\" `Y8bod8P' d888b    \r\n" + //
                        "                                                                                    \r\n" + //
                        "                                                                                    \r\n" + //
                        "                                                                                    \r\n" + //
                        "");
        Scanner scanner = new Scanner(System.in);
        // Step 1: Ask for the indivual Assignment Grades
        System.out.print("Enter your Assignment 1 grade (1-100): ");
        int assignment1 = scanner.nextInt();

        System.out.print("Enter your Assignment 2 grade (1-100): ");
        int assignment2 = scanner.nextInt();

        System.out.print("Enter your Assignment 3 grade (1-100): ");
        int assignment3 = scanner.nextInt();
        System.out.println();

        // Step 2: Ask for the individual Quiz Grades
        System.out.print("Enter your Quiz 1 grade (1-100): ");
        int quiz1 = scanner.nextInt();

        System.out.print("Enter your Quiz 2 grade (1-100): ");
        int quiz2 = scanner.nextInt();

        System.out.print("Enter your Quiz 3 grade (1-100): ");
        int quiz3 = scanner.nextInt();
        // Step 3: Ask for the project grade
        System.out.println();
        System.out.print("Enter your Project grade (1-100): ");
        int project = scanner.nextInt();

        // Step 4: Calculations
        // Average the assignments together
        double assignmentsAverage = (assignment1 + assignment2 + assignment3) / 3.0;
        System.out.println("Your overall assignment grade is " + assignmentsAverage + "%");
        // Average the quizzes together
        
        double quizzesAverage = (quiz1 + quiz2 + quiz3) / 3.0;
        System.out.println("Your overall quiz grade is " + quizzesAverage + "%");

        System.out.println();
        // Overall average
        double overall = assignmentsAverage * 0.25 + quizzesAverage * 0.25 + project * 0.5;
        System.out.println("Your overall grade is " + overall + "%");

        scanner.close();
    }

}
