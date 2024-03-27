package com.skillstorm;

public class App {
    public static void main(String[] args) throws Exception {
        ShoppingCart cart = new ShoppingCart();
        System.out.println(cart.MAX_NUM_ITEMS);
        System.out.println(ShoppingCart.SHOP_NAME); // STATIC PROPERTIES ACCESS IN A STATIC WAY
    }
}
