package com.dunky.javacollections.generics;

public class GenericTests {
    public static void main(String[] args) {

        MyGenericClass<String> s = new MyGenericClass<>("Gujarat");
        s.displayObjDetails();
        System.out.println(s.getObject());

        MyGenericClass<Integer> i = new MyGenericClass<>(123);
        i.displayObjDetails();
        System.out.println(i.getObject());


        MyGenericClass<Double> d = new MyGenericClass<>(123.90);
        d.displayObjDetails();
        System.out.println(d.getObject());

    }
}
