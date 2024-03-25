package com.skillstorm;

import java.util.Scanner;

public class StudyQuestions {

    public static void main(String[] args) {
        String[] questions = {"What is an array?","What is switch statement?","What is the difference between while and do-while?"};
        String[] answers = {"A data structure that holds a fixed number of values of a single type contiguously in memory and indexed started at 0", "A control flow statement. Unlike if-then and if-then-else statements, the switch statement can have a number of possible execution paths. A switch works with the byte, short, char, and int primitive data types.", "A while loop runs 0 or more times whereas a do-while always runs at least once because it checks the condition at the end of the loop instead of the beginning"};

        // study game loop
        while (true) {
            Scanner scanner = new Scanner(System.in);
            // Show them a question

            // Prompt them to press any key to coninue
            scanner.nextLine();

            // Show them the answer

            // Would they like to continue
            String response = scanner.nextLine();
            if (!response.equals("yes"))
                break;
        }
    }

}
