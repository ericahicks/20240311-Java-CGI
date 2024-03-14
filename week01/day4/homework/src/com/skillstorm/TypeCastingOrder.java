package com.skillstorm;

public class TypeCastingOrder {

    public static void main(String[] args) {
        double numOfOrangesPerPerson = 2.5; 
        int numPeople = 6;
        // int numOranges = (int) numOfOrangesPerPerson * numPeople; // 2 * 6 = 12
        int numOranges = (int) (numOfOrangesPerPerson * numPeople); // 2.5 * 6 = 15
        System.out.println("Given 2.5 oranges per person and 6 people, we have");
        System.out.println("Total number of oranges " + numOranges);

    }

}
