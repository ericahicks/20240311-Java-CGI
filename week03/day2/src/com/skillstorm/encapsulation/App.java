package com.skillstorm.encapsulation;

import com.skillstorm.encapsulation.example1.Worker;

public class App {

    public static void main(String[] args) {
        // Example 1:
        Worker worker1 = new Worker();
        // worker1.name = "Suzanna";
        worker1.setName("Suzanna");
        // worker1.salary = 200000; // can't use direct access to property
        worker1.setSalary(200000); // use public setter
        // worker1.companyName = "SkillStorm";
        worker1.setCompanyName("SkillStorm");
        worker1.setNickname("Suzy");

        // Example 2:
        Worker worker2 = new Worker("Samuel", "SkillStorm", 1000000, "Sammie");
        System.out.println(worker1);
        System.out.println(worker2);

        // Example 3:
        System.out.println("> Updating Sammie's nickname to Sam");
        worker2.setNickname("Sam");
        System.out.println(worker2);
        System.out.println("> Trying to update Sammie's nickname to null");
        worker2.setNickname(null);
        System.out.println(worker2);

        // Example 4:
        System.out.println("> Trying to set Sam's manager to himself");
        worker2.setManager(worker2);
        System.out.println(worker2);
        System.out.println("> Trying to set Sam's manager to Suzy");
        worker2.setManager(worker1);
        System.out.println(worker2);

        System.out.println("> Updating Suzy's pay");
        worker1.setSalary(worker1.getSalary() * 1.05);
        System.out.println(worker1);
        System.out.println(worker2);

    }

}
