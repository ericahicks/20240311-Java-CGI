package com.skillstorm.examples.variables;

public class DefaultValues {
    
    // these class variables are known as "fields" or "properties"
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f; // less accurate only has 7 decimal places
    static double d;
    static char c;

    public static void main(String[] args) {
        // print default values
        System.out.println("b = " + b); // string concatenation = chain together 
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("c = " + c); // CTRL-SHIFT-DOWN-ARROW copies this line below

        // variables declared inside a method only exist inside that method (curly braces)
        // local variables - do not get default values, you MUST assign value before using them
        byte b2;
        short s2;
        int i2;
        long l2;
        float f2; // less accurate only has 7 decimal places
        double d2;
        char c2;
        // System.out.println("b2 = " + b2); // cannot use before initialization (local variables don't get defaults)
    }

}
