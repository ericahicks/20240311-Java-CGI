package com.skillstorm;

public class StringExamples {


    public static void main(String[] args) {
        // // Strings are immutable so a new String is created when we change str
        // String str = "Hello";
        // String str2;
        // str2 = str; // str2 holds the memory address of the original "Hello"
        // System.out.println(str);
        // System.out.println(str2);
        // str += " World!"; // str holds the memory address of the new "Hello World!"
        // System.out.println(str);
        // System.out.println(str2);

        // Strings are immutable
        // Save the result
        String name = "Erica";
        // COMMON BUG
        name.toUpperCase(); // creates a new String so you must save the reference to the new String 
        System.out.println(name);
        // Correct version
        name = name.toUpperCase();
        System.out.println(name);

        // Using indexes
        // charAt
        String hello = "Hello";
        ///             01234
        System.out.println(hello.charAt(1));
        // indexOf
        System.out.println(hello.indexOf('l')); // prints? 2 (stops looking once finds l)

        // substring(start)
        System.out.println(hello.substring(3));

        // substring(start, end) // start inclusive, end exclusive
        String substring = hello.substring(0, 2);
        System.out.println(hello);
        System.out.println(substring); // 

        // String.format(template-string, ....);
        /*
         * Category | Weight
         * -------------------
         * Quiz     |  0.33
         * Homework |  0.33
         * Project  |  0.66
         */
        String table = String.format("%-10s| Weight%n-------------------%n%-10s|%8.2f%n%-10s|%8.2f%n%-10s|%8.2f", 
                                        "Category",
                                        "Quiz", 1.0/3.0,
                                        "Homework", 1.0/3.0,
                                        "Project", 2.0/3.0);
        System.out.println(table);

        // System.out.format() and system.out.printf are synonymx
        System.out.printf("%-10s| Weight%n-------------------%n%-10s|%8.2f%n%-10s|%8.2f%n%-10s|%8.2f", 
                                        "Category",
                                        "Quiz", 1.0/3.0,
                                        "Homework", 1.0/3.0,
                                        "Project", 2.0/3.0);

    }
}
