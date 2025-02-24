package com.dunky.javacollections.set;

import java.util.*;

public class HashSetMethods {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 20; i++) {
            list.add(rand.nextInt(10));
        }
        System.out.println("List" +list);

        Set<Integer> set = new HashSet<Integer>(list);
        System.out.println("Set" +set);

    }
}
