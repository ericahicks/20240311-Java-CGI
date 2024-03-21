package com.skillstorm;

import java.util.Arrays;

public class ArrayLoopsPractice {

    public static void main(String[] args) {
        // example1A();
        // example1B();
        // example2A();
        // example2B();
        System.out.println(sum(new int[]{1, 2, 3, 4}));
        String result = combine(new String[]{"have", "a", "nice", "day", "!"});
        System.out.println(result);
        // remainingBalance();
    }

    ////////////////////////////////
    // Example 1:
    // Print using for-loop
    public static void example1A() {
        int[] nums = {1, 2, 3};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element at index " + i + " is " + nums[i]);
        }
    }

    // Print using for-each loop
    public static void example1B() {
        int[] nums = {1, 2, 3};
        for (int n : nums) {
            System.out.println(n);
        }
    }

    ////////////////////////////////
    // Example 2:
    // Update using for-loop
    public static void example2A() {
        int[] nums = {1, 2, 3};
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 3;
        }
        System.out.println(Arrays.toString(nums));
    }

    // Update attempt using for-each loop
    public static void example2B() {
        int[] nums = {1, 2, 3};
        for (int n : nums) {
            n = n * 3;
        }
        System.out.println(Arrays.toString(nums));
    }
    ////////////////////////////////
    // Example 3:
    // Sum array
    public static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            System.out.println("sum is now " + sum);
            System.out.println("> adding " + num);
            // sum = 0; // don't initialize in the loop, this resets it to zero instead of accumulating the result
            sum += num;
        }
        return sum;
    }

    // Append words
    public static String combine(String[] words) {
        String result = "";
        for (String str : words) {
            result += str + " ";
        }
        return result;
    }

    ////////////////////////////////
    // Example 4:
    // Subtract from bank account expenses
    public static double remainingBalance(double balance, double[] spending) {
        return 0;
    }


}
