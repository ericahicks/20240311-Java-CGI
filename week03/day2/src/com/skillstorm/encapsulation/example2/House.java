package com.skillstorm.encapsulation.example2;

public class House {

    private String color;

    public House(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "House [color=" + color + "]";
    }

    

}
