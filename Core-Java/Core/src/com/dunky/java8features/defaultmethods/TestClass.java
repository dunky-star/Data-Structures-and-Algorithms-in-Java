package com.dunky.java8features.defaultmethods;

public class TestClass {
    public static void main(String[] args) {
        A a = () -> System.out.println("Inside my method");
        a.aMethod();
        a.bMethod(10, 3);

        A d = new D();
        d.bMethod(5, 5);
    }

}
