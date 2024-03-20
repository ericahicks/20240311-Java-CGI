package com.skillstorm;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        ////////////////////////
        // Creating Arrays 3 ways
        // 1. new operator
        int[] evens = new int[3];
        evens[0] = 2;
        evens[1] = 4;
        evens[2] = 6;

        // 2. array literals
        String[] bestFriends = {"Brian", "Carey", "Natalie", "Anderson"};
        //                         0       1        2           3

        // 3. new operator with array literal
        int[] evens2 = new int[]{2, 4, 6};

        ///////////////////////////////////
        // Printing Arrays
        System.out.println(bestFriends); // prints reference info not contents
        System.out.println(Arrays.toString(bestFriends)); // prints contents

        //////////////////////////////////
        // Accessing elements
        // Reasign values
        System.out.println("> Updating spelling of Carey in original");
        bestFriends[1] = "Carry";
        System.out.println(Arrays.toString(bestFriends));
        

        ///////////////////////////////////
        // Resize array
        // bestFriends[4] = "Kristen"; // ArrayIndexOutOfBoundsException: 4
        System.out.println("> Creating copyOf original");
        String[] bestFriends2 = Arrays.copyOf(bestFriends, 5);
        System.out.println(Arrays.toString(bestFriends2));
        System.out.println("> Adding Kristen");
        bestFriends2[4] = "Kristen";
        System.out.println(Arrays.toString(bestFriends2));

        bestFriends[2] = "Nathan";
        System.out.println("> Updating name of Natalie to Nathan in original");
        System.out.println(Arrays.toString(bestFriends));
        System.out.println(Arrays.toString(bestFriends2));


        /////////////////////////////////////
        // Compare arrays
        System.out.println("Array comparison");
        System.out.println("== is " + (evens == evens2)); // compares memory addresses
        System.out.println(".equals is " + Arrays.equals(evens, evens2)); // compares contents

        // String comparison
        System.out.println("String comparison: ");
        String str = "hello";
        String str2 = "hello";
        System.out.println("== is " + (str == str2));
        System.out.println(".equals is " + str.equals(str2));

        /////////////////////////////
        // copyRange - indexing is start-inclusive and end-exclusive
        int[] copyEvens = Arrays.copyOfRange(evens, 0, 2); // evens holds {2, 4, 6}
                                                           // indexes      0  1  2 
        System.out.println("\ncopyEvens is " + Arrays.toString(copyEvens)); // [2, 4]

        ////////////////////////////////
        // Cannot access element at invalid index
        int[] nums = {1, 2, 3};
        System.out.println(getFirstElement(nums)); // 1
        int[] nums2 = {}; // empty
        System.out.println(getFirstElement(nums2)); // java.lang.ArrayIndexOutOfBoundsException: 0
        int[] nums3 = null;
        System.out.println(getFirstElement(nums3));


    } // end main

    public static int getFirstElement(int[] nums) {
        // guard clause
        // how can I stop nums[0] from executing when it will throw NullPointerException? default to -1
        if (nums == null) 
            return -1;
        // how can I stop nums[0] from executing when it will throw ArrayIndexOutOfBoundsException? default to 0
        if (nums.length == 0)
            return 0; // return default 0
        else
            return nums[0];
    }

    public static char getFirstCharacter(String str) {
        // guard claue
        if (str == null || str.length() == 0) {
            return '\u0000'; // note '' empty character is not valid so use unicode notation
        } 
        return str.charAt(0);
    }
} // end class
