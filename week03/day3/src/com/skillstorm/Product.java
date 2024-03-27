package com.skillstorm;

public class Product {

    private String name = "";
    private String description = "";
    private double price = 0;

    public Product() { } // no-arg constructor

    public Product(String name, String description, double price) { // fully parameterized constructor
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", description=" + description + ", price=" + price + "]";
    }

    

}
