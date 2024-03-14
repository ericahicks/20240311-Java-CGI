package com.skillstorm;

public class ArithmeticPractice {
    // Hold down ALT and click on multiple locations to type at all of them
    // "multicursor"
    // Prettify your code with SHIFT-ALT-F *** Do this every time before you submit your assignment ***
    public static void main(String[] args) {
        System.out.println("Modulus examples:");
        int result = 1 % -2; // Remainder - takes on the sign of the first argument
        System.out.println(result);
        System.out.println("  vs Mod result in " + Math.floorMod(1, -2));
        result = -1 % 2;
        System.out.println(result);
        System.out.println("  vs Mod result in " + Math.floorMod(-1, 2));
        result = -1 % -2;
        System.out.println(result);
        System.out.println("  vs Mod result in " + Math.floorMod(-1, -2));
        result = 0 % 2; // 0 / 2 remainder is 0
        System.out.println(result);
        // result = 2 % 0; // 2 / 0 remainder is undefined or NaN or an error
        System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: / by zero");

        System.out.println("\nType Casting examples:");
        byte answer = (byte) 1000 - 10; // byte and int = int >> byte
        System.out.println(answer);
        // System.out.println("(byte) 1000 - 10 = " + (byte) 1000 - 10); // 1000 >> byte >> String --> can't subtract from a String
        System.out.println("(byte) 1000 - 10 = " + ((byte) 1000 - 10)); // 1000 >> byte >> - 10 >> concatenate
        System.out.println((byte) 1000); // higher digits chopped off 1000 --> -24
        System.out.println((short) 100000);

        // Can you find the type of a variable using Java built-in functionality?
        String s = "hi";
        System.out.println(s instanceof String);
        System.out.println(s.getClass());

        
    }

}
