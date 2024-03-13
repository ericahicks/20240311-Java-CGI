package com.skillstorm;

import java.util.Scanner;

/**
 * Grade calculator created during Week 1 - Wednesay Classwork 
 * @author Michael, Sonia
 */
public class Group2GradeCalculator {

    public static void main(String[] args) {

        //double assignments, quizzes, projects;

        Scanner scanner = new Scanner(System.in);
        
        //prompts
        System.out.println("Enter in your overall assignment grade as a number between 0-100: ");
        double assignments = scanner.nextDouble();

        System.out.println("Enter in your overall quiz grade as a number between 0-100: ");
        double quizzes = scanner.nextDouble();

        System.out.println(" Enter in your overall project grade as a number between 0-100: ");
        double projects = scanner.nextDouble();

         // calculation
        double weightedAssignments = assignments * .25;
        double weightedQuizzes = quizzes * .25;
        double weightedProjects = projects * .50;

        System.out.println("Your overall grade is: " + (weightedAssignments + weightedQuizzes + weightedProjects));

        scanner.close();
        
    }

}
