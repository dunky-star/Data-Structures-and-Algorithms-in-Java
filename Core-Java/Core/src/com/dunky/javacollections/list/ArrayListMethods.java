package com.dunky.javacollections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        arrayListOfInteger(list1);

        List<Integer> secondList = new ArrayList<Integer>();
        secondList.add(1000);
        secondList.add(2000);
        secondList.add(3000);

        // Merging two lists
        list1.addAll(3, secondList);
        System.out.printf("List after addAll: %s\n", list1);

        // Searching through list
        if(list1.contains(100)){
            System.out.println("List contains 100");
        }else{
            System.out.println("List does not contain 100");
        }

        // Accessing elements from the list using "ITERATOR" loop.
        Iterator<Integer> itr = list1.iterator();
        while(itr.hasNext()){
            int element = itr.next();
            if(element == 100){
                itr.remove();
            }
        }

        //list1.remove(1);
        System.out.println("List after removing in iterator: " +list1);
    }

    private static void arrayListOfInteger(List<Integer> list1) {
        for (int i = 10; i <= 100; i += 10) {
            list1.add(i);
        }
        System.out.println("List: " +list1);

        list1.add(2, 100);
        System.out.println("List after insert: " +list1);

        list1.set(3, 200);
        System.out.println("List after replacement: " +list1);
    }
}
