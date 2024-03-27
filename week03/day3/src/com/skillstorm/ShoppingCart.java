package com.skillstorm;

/*
 * Fully encapsulate the class 
 * - Step 1: mark properties as private
 * - Step 2: create public getters and setters
 */
public class ShoppingCart {

    // constants 
    // - are defined using the final keyword
    // - can be made public because they are safe from anyone changing them
    // - naming convention is capslock with underscores between words MAX_VALUE MIN_VALUE
    // - you can only assign a value once 
    // - don't need to create getters and setters

    private String customer = "";
    private Product[] items;
    public final int MAX_NUM_ITEMS;
    private int numItems = 0;
    public static final String SHOP_NAME = "Shopping App";

    public ShoppingCart() {
        this.MAX_NUM_ITEMS = 10;
        this.items = new Product[MAX_NUM_ITEMS];
    }

    public void welcome() {
        final String message;
        message = "Welcome";
        // message += " to the shopping app"; // can't update value of a constant
        System.out.println(message);
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customerName) {
        this.customer = customerName;
    }

    public Product[] getItems() {
        return items;
    }

    public Product getItem(int index) {
        return items[index];
    }

    public void setItems(Product[] items) {
        this.items = items;
    }

    public void setItem(int index, Product product) {
        if (index >= 0 && index < MAX_NUM_ITEMS)
            this.items[index] = product;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    


}
