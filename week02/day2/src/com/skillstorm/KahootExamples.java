package com.skillstorm;

public class KahootExamples {

    // Kahoot Examples
    ////////////////////////////////////
    // /* String */ void hi() {
    // System.out.println("hi");
    // }

    /*
     * 6 Parts of Method declaration
     * 1. access modifier
     * 2. modifiers
     * 3. return type
     * 4. method name
     * 5. parameters
     * 6. body
     * 
     */
    String hi() {
        return "Hello";
    }

    /*
     * Required parts of a method declaration:
     * - return type
     * - method name
     * - parenthesis
     * - curly braces
     * - (return statement if not a void method)
     */
    void smallMethod() {
        // return;
    }

    String echo(String str) { // parameters need a type and name
        return str;
    }

    /////////////////////////////
    // Overloading examples - methods with the same name must have different
    ///////////////////////////// parameter types/number/order
    String greeting() {
        return "Hello!";
    }

    String greeting(String name) {
        return name + " hello!";
    }

    // String greeting(String adjective) { // type of parameter not name is what
    // matters
    // return "Have a " + adjective + " day!";
    // }

    // void greeting() { // return type is not part of the signature
    // System.out.println("Hello");
    // }

    // Bike ride example - boolean utility method

    // Group work -

    // Switch Statements

    // Github
}
