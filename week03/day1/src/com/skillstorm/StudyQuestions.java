package com.skillstorm;

import java.util.Scanner;

public class StudyQuestions {

    public static void main(String[] args) {
        String[] questions = { "What is an array?", "What is switch statement?",
                "What is the difference between while and do-while?" };
        String[] answers = {
                "A data structure that holds a fixed number of values of a single type contiguously in memory and indexed started at 0",
                "A control flow statement. Unlike if-then and if-then-else statements, the switch statement can have a number of possible execution paths. A switch works with the byte, short, char, and int primitive data types.",
                "A while loop runs 0 or more times whereas a do-while always runs at least once because it checks the condition at the end of the loop instead of the beginning" };
        int index = 0;
        // study game loop
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Show them a question
            System.out.println("=======================================================");
            System.out.println(questions[index]);
            System.out.println();
            // Prompt them to press any key to coninue
            System.out.println("Press any key to reveal answer...");
            scanner.next();

            // Show them the answer
            System.out.println("\nAnswer:");
            System.out.println(answers[index]);
            System.out.println();
            index = (index + 1) % 3; // if index >= 3 restart at 0

            // Would they like to continue
            System.out.print("Would you like another question? ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                scanner.close();
                break;
            }
        }
        scanner.close();

    }

}
