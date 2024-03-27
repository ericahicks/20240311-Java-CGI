package com.skillstorm;

import java.util.Random;

public class ProtectedExample extends Random {

    public static void main(String[] args) {
        ProtectedExample randomGenerator = new ProtectedExample();
        // randomGenerator.next(7); // don't have direct access
        System.out.println(randomGenerator.next(7)); // number between 0 and 127

    }

    // use inheritance to acess it
    public int next(int bits) { 
        return super.next(bits); // I have access to protected methods
    }

}
