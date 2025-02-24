package com.dunky.java8features.defaultmethods;

public interface C {

    default void bMethod(int a, int b) {
        System.out.println("Default bMethod in interface C: " +(a+b));
    }
}
