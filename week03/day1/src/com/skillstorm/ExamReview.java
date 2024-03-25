package com.skillstorm;

import java.util.Scanner;

public class ExamReview {

    static void printName(String x /* = Doe */, String y /* = John */) { // parameters that get assigned a value
        System.out.println(x + " " + y);
      }
    
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First Name: ");
        String first = in.nextLine();
        
        System.out.print("Last Name: ");
        String last = in.nextLine();
        printName(first, last);
        // String a = "John";
        // String b = "Doe";
        // printName(b /* "Doe" */, a /* "John" */); //arguments passed in
        in.close();
      }

}
