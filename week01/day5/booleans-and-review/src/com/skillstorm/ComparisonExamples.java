package com.skillstorm;

public class ComparisonExamples {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a = b);
        System.out.println(a == b);
        System.out.println(a != b);

        String str = "hello";
        String app = "apple";
        // System.out.println(str < app);
        System.out.println(str == app); // bad style, unpredicatable

        String str2 = new String("hello"); // creat a new string at a new memory address
        System.out.println("Does hello == hello");
        System.out.println(str == str2);
        System.out.println("Does hello.equals(hello)");
        System.out.println(str.equals(str2));
        String str3 = new String("HELLO");
        boolean result = str.equals(str3);
        boolean result2 = str.equalsIgnoreCase(str3);
        System.out.printf("Does %s.equal(%s)? %b%n", str, str3, result);
        System.out.printf("Does %s.equalIgnoreCase(%s)? %b%n", str, str3, result2);

        // Moved Number Guessing Game to separate file.
        // com.skillstorm.NumberGuessingGame.java
    }
}
