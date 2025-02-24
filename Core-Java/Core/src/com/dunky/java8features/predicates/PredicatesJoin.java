package com.dunky.java8features.predicates;

import java.util.function.Predicate;

public class PredicatesJoin {
    public static void main(String[] args) {
        int[] x = {0, 7, 10, 20, 30, 40, 50, 60 , 70, 73, 80};

        Predicate<Integer> pX = i -> i > 10;
        Predicate<Integer> pY = i -> i%2 == 0;

        System.out.print("Greater than 10: ");
        checkValues(pX, x);

        System.out.print("\nEven numbers: ");
        checkValues(pY, x);

        System.out.print("\nGreater than 10 and Even numbers: ");
        checkValues(pX.and(pY), x);
    }

    private static void checkValues(Predicate<Integer> p1, int[] arr){
       for (int eachValue: arr){
           if(p1.test(eachValue)){
               System.out.print(eachValue);
               System.out.print(",");
           }
           System.out.print(" ");
       }
    }
}
