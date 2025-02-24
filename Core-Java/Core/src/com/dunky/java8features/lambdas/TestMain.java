package com.dunky.java8features.lambdas;

public class TestMain {
    public static void main(String[] args) {
        Sum s = (x, y) -> System.out.println("Sum: "+ (x  + y));
        s.add(10, 40);
    }
}
