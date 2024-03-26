package com.skillstorm.encapsulation.example1;

// Fully encapsulate = every property is marked private
public class Worker {

    private String name;
    private String companyName;
    private double salary;
    private String nickname;
    private Worker manager;

    // no-arg constructor
    public Worker() { }

    // fully-parameterized constructor
    public Worker(String name, String companyName, double salary, String nickname) {
        this.name = name;
        this.companyName = companyName;
        this.salary = salary;
        this.nickname = nickname;
    }

    // Getters and Setters
    // public [type-of-property] getNameOfProperter()
    public String getName() {
        return name;
    }

    // public void setNameOfProperty([type-of-property] arg)
    public void setName(String name) {
        if (name != null && name.length() > 1)
            this.name= name;
    }

    // company name getter
    public String getCompanyName() {
        return this.companyName;
    }

    // company name setter
    public void setCompanyName(String companyName) {
        if (companyName != null && companyName.length() > 1)
            this.companyName = companyName;
    }

    // salary getter
    public double getSalary() {
        return this.salary;
    }

    // salary setter
    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    // nickname getter
    public String getNickname() {
        return this.nickname;
    }

    // nicker setter
    public void setNickname(String nickname) {
        if (nickname != null && nickname.length() > 1)
            this.nickname = nickname;
    }

    
    public Worker getManager() {
        return manager;
    }

    public void setManager(Worker manager) {
        if (manager != null && manager != this) // prevent the same object being assigned to itself's manager property
            this.manager = manager;
    }

    @Override
    public String toString() {
        return "Worker [name=" + name + ", companyName=" + companyName + ", salary=" + salary + ", nickname=" + nickname
                + ", manager=" + manager + "]";
    }

    


    

}
