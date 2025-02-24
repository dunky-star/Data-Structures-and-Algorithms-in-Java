package com.dunky.java8features.defaultmethods;

@FunctionalInterface
public interface B extends A {

    void aMethod();

    @Override
    default void bMethod(int a, int b) {
        System.out.println("Default method overridden in B");
    }
}
