package com.dunky.java8features.functionalinterface;

public class TestClass {
    public static void main(String[] args) {
        MyFuncInterface func = () -> System.out.println("Inside my method");
        func.myMethod();
    }

}
