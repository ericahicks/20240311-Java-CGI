package com.skillstorm;

import java.util.Scanner;

public class SwitchExamples {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which greeting would you like your character to use?");
        char c = in.next().charAt(0);
        SwitchExamples.greeting(c);
        in.close();
        System.out.println("Ok, thanks. Greeting has been set");
    }

    public static String greeting(char c) {
        switch (c) {
            case 'a': return "Hi";
            case 'b': return "Goodbye";
            default: return "Huh?";
        }
    }
    
}
