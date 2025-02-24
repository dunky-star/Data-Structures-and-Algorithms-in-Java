package com.dunky.java8features.defaultmethods;

/*
* We are not allowed to implement two interfaces with the same default method in a class
* without overriding the default method of the two interfaces - Diamond problem.
*/

public class D implements B, C{
    @Override
    public void aMethod() {
      System.out.println("Overridden in D");
    }

    @Override
    public void bMethod(int a, int b) {
        System.out.println("Default bMethod in class D: " +(a+b));
    }
}
