package com.skillstorm.abstraction;

public abstract class Shape {
    private String name;

    // Why am I allowed to define a constructor when
    // I can never create a Shape with Shape shape = new Shape();
    public Shape(String name) {
        this.name = name;
        System.out.println("In the Shape constructor");
    }

    public abstract double area();

    public abstract void draw();

    public String getName() {
        return name;
    }

}

// Example subclass 
// Should be in it's own file, but for demo purposes only
class Square extends Shape {
    private int side;
    public Square(int side) {
        super("Square");
        System.out.println("In the square constructor");
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Here is your " + getName());
        System.out.println("-----------\r\n" + //
                        "|         |\r\n" + //
                        "|         |\r\n" + //
                        "|         | \r\n" + //
                        "|         |\r\n" + //
                        "-----------");
    }
}

class Triangle extends Shape {
    private int base;
    private int height;
    public Triangle(int base, int height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }
    @Override
    public void draw() {
        System.out.println("Here is you " + getName());
        System.out.println("     /\\\r\n" + //
                        "    /  \\\r\n" + //
                        "   /    \\\r\n" + //
                        "  /      \\\r\n" + //
                        " /        \\\r\n" + //
                        "/          \\\r\n" + //
                        "------------");
    }
}

class Test {
    public static void main(String[] args) {
        Shape shape1 = new Square(1);
        Shape shape2 = new Triangle(2, 1);
        shape1.draw();
        shape2.draw();
    }
}
