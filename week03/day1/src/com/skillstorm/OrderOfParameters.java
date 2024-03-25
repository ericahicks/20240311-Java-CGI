package com.skillstorm;

public class OrderOfParameters {

    public static void orderProduct(String productName, String productColor) {
        System.out.println("Ordering a " + productName + " in the color " + productColor);
    }

    public static void orderProduct(int count, String productName) {
        System.out.println("Order " + count + " of product " + productName);
    }

    public static void main(String[] args) {
        orderProduct("sweater", "purple");
        orderProduct(10, "tshirts");
        // orderProduct( "tshirts", 10); // order of arguments passed in must match order of parameters defined
    }

}
