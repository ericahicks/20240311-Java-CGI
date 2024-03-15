package com.skillstorm.constructors;

public class OopIntro {

    public static void main(String[] args) {
        // Alternative to using classes
        String student1Name = "Sam";
        String student2Name = "Sue";
        char student1Grade = 'A';
        char student2Grade = 'B';

        // Example Constructor call
        Student student1 = new Student("Sam", 'A');
        Student student2 = new Student("Sue", 'B');

        String today = "Saturday";
        // If it's not the weekend, create some students
        // check if today is saturday or sunday
        boolean todayIsSaturday = today.equals("Saturday"); // == "Saturday";
        boolean todayIsSunday = today.equals("Sunday");
        boolean isWeekend = todayIsSaturday || todayIsSunday;
        Student stephen = new Student("Stephen", 'A');
        Student michael = new Student("Michael", 'A');
        Student ayola = new Student("Ayola", 'A');
        if (!isWeekend) {
            // create students
            System.out.printf("Good morning %s, %s, and %s%n",
                    stephen.name,
                    michael.name,
                    ayola.name);
        } else {
            System.out.printf("Have a good weekend %s, %s, and %s%n",
                    stephen.name,
                    michael.name,
                    ayola.name);
        }
    }
}
