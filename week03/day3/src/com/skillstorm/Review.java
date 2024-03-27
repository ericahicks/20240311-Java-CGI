package com.skillstorm;

public class Review {

    public static void main(String[] args) {
        // variable declaration
        int x;
        boolean b;

        // variable assignment
        x = 1;
        b = true;

        // objects
        Bookstore bookstore;

        // instantiation;
        bookstore = new Bookstore();

        // Benefits of objects 
        String student1Name = "Same";
        char student1Grade = 'A';
        String student2Name = "Suzy";
        char student2Grade = 'B';

        String[] students = {student1Name, student2Name};
        char[] grades = {student1Grade, student2Grade};

        Student student1 = new Student("Sam", 'A');
        Student student2 = new Student("Suzy", 'B');

        Student[] gradebook = new Student[]{student1, student2};

    }

}

// Group data and methods 
class Student {
    String name;
    char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }
}

// You can have more than one class in a file
// but only public class perfile
// and DO NOT DO THIS - THIS IS JUST FOR DEMO PURPOSES

class Bookstore { String name; int size; }