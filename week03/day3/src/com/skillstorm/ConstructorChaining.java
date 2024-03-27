package com.skillstorm;

public class ConstructorChaining {

    public static void main(String[] args) {
        A a = new A("hello");
        // B b = new B();
        // C c = new C();
    }

}

class A {
    public A() {
        super(); // this call to super() is ALWAYS made first thing (even if we don't put it)
        System.out.println("Constructing A");
    }

    public A(String message) {
        this();
        System.out.println(message);
    }
    // overloading - multiple methods ofd the same name but different paramters in the same class

    // overriding - methods of the same name and paramters in a child and parent class

    void doStuff() {
        System.out.println("Stuff A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Constructing B");
    }

    @Override // optional but recommended (good style to tell your reader and the Java compiler)
    void doStuff() {
        System.out.println("Stuff B");
    }
}

class C extends B {
    public C() {
        super();
        System.out.println("Constucting C");
    }
}
