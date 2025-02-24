package com.dunky.java8features.predicates;
/*
* A predicate is a function with single Argument and returns a boolean.
*/

import java.util.function.Predicate;

public class FuncPredicates {
    public static void main(String[] args) {
        Predicate<Integer> p = i->(i>20);
        System.out.println(p.test(22));

        Predicate<String>  pS = s->(s.length()>5);
        System.out.println(pS.test("Geoffrey"));
    }
}
