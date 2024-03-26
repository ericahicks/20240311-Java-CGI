package com.skillstorm.encapsulation.example2;

public class App3 {

    public static void main(String[] args) {
        House house1 = new House("Yellow");
        HomeOwner owner1 = new HomeOwner("Doug", house1);
        
        HomeOwner owner2 = new HomeOwner("Tula", house1);
        System.out.println(owner2);
        
        owner1.getHouse().setColor("Pink");
        System.out.println("> Uhoh someone comes and messes with Tula's house");
        System.out.println(owner2);
    }

}
