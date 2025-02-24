package com.dunky.javacollections.list;


import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    public static void main(String[] args) {
        Object[] objects = new Object[1000000];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Object();
        }

        List<Object> ll = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (Object object : objects) {
            ll.add(object);
        }
        long end = System.currentTimeMillis();
        System.out.println("Execution duration: " + (end - start));

        List<Integer> secondLL = new LinkedList<Integer>();
        secondLL.add(4000);
        secondLL.add(22000);
        secondLL.add(5000);

        // Merging two lists
        ll.addAll(4, secondLL);

        // Searching through list
        if (ll.contains(100)) {
            System.out.println("List contains 100");
        } else {
            System.out.println("List does not contain 100");
        }

        ll.remove(1);
    }

}
