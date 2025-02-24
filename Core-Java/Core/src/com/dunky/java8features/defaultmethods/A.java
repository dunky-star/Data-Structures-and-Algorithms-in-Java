package com.dunky.java8features.defaultmethods;

@FunctionalInterface
public interface A {

    void aMethod();

    default void bMethod(int a, int b) {
        System.out.println("Default Method result in interface A: " +(a + b));
    }
}
