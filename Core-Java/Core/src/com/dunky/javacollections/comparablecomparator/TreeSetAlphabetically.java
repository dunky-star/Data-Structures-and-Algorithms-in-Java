package com.dunky.javacollections.comparablecomparator;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetAlphabetically {

    public static void main(String[] args) {

        Set<StringBuffer> setStr = new TreeSet<StringBuffer>(new SBComparator());
        setString(setStr);

    }

    public static void setString(Set<StringBuffer> setString) {
        setString.add(new StringBuffer("geoffrey"));
        setString.add(new StringBuffer("abc"));
        setString.add(new StringBuffer("duncan"));
        setString.add(new StringBuffer("xyz"));
        setString.add(new StringBuffer("def"));
        setString.add(new StringBuffer("mno"));
        setString.add(new StringBuffer("kaligs"));
        setString.add(new StringBuffer("sheen"));

        for (StringBuffer value : setString) {
            System.out.println(value);
        }
    }
}
