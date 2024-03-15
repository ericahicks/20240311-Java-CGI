package com.skillstorm.constructors;

/**
 * Student is a class that holds data about a Student
 */
public class Student {

    // class variable - class scope
    static int numStudents;
   
    // instance variables - scoped to the object's lifespan, so when the object is marked for garbage collection, these will be as well
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
