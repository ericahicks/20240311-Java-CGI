package com.skillstorm.examples.constructors;

/**
 * Student is a class that holds data about a Student
 */
public class Student {

    // 
    static int numStudents;
   
    // 
    String name;
    char grade;

    // 
    public Student(String str, char c) {
        name = str;
        grade = c;
        numStudents = numStudents + 1;
    }

    // Methods

}
