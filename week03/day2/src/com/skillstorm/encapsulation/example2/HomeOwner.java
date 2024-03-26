package com.skillstorm.encapsulation.example2;

public class HomeOwner {
    private String name;
    private House house;

    public HomeOwner(String name, House house) {
        this.name = name;
        this.house = new House(house.getColor());// don't assign the reference house; instead create a copy
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) { // Ex: arrays are refernce types Arrays.copyOf() or just assign a reference?
        this.house = new House(house.getColor()); // house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HomeOwner [name=" + name + ", house=" + house + "]";
    }


    

}
