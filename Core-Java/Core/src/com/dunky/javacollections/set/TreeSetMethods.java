package com.dunky.javacollections.set;


import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
* TreeSet orders the String in natural order (alphabetical order).
*/

public class TreeSetMethods {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<Integer>();

        Random rand = new Random();

        for(int i= 0; i < 20; i++){
            int number =  rand.nextInt(50);
            set.add(number);
        }

        System.out.println(set);

        Set<String> setStr = new TreeSet<String>(new TSComparator());
        sString(setStr);

    }

    public static void sString(Set<String> setStr) {
        setStr.add("geoffrey");
        setStr.add("abc");
        setStr.add("duncan");
        setStr.add("xyz");
        setStr.add("def");
        setStr.add("mno");
        setStr.add("kaligs");
        setStr.add("sheen");

        for (String value : setStr) {
            System.out.println(value);
        }
    }
}
