package com.dunky.java8features.functions;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        Function<String, Integer> lengthString = String::length;
        System.out.println("Length of String: " +lengthString.apply("Geoffrey"));
        System.out.println("Length of String: " +lengthString.apply("Where are you Geoffrey?"));
    }
}
