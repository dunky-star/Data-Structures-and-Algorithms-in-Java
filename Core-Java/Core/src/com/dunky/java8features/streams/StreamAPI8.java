package com.dunky.java8features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI8 {

    // A method that convert list of String to lowercase using Stream API and returns sorted list.
    private static List<String> convertCase(ArrayList<String> list){
        if(list.isEmpty()){
            return null;
        }
        return list.stream().map(String::toLowerCase).sorted().collect(Collectors.toList());
    }

    // A method that filters even numbers from list of Integers using Stream API.
    private static List<Integer> evenNumbers(ArrayList<Integer> list){
        if(list.isEmpty()){
            return null;
        }
        Comparator<Integer> comp = (o1, o2) -> o2.compareTo(o1);
        return list.stream().filter(i -> i%2 == 0).sorted(comp).collect(Collectors.toList());
    }

    // A method that filters even numbers from list of Integers using Stream API and return max.
    private static Integer maxEvenNumbers(ArrayList<Integer> list){
        if(list.isEmpty()){
            return null;
        }
        Comparator<Integer> comp = Integer::compareTo;
        return list.stream().filter(i -> i%2 == 0).max(comp).orElse(0);
    }

    // A method that filters even numbers from list of Integers using Stream API and return max.
    private static Integer minEvenNumbers(ArrayList<Integer> list){
        if(list.isEmpty()){
            return null;
        }
        Comparator<Integer> comp = Integer::compareTo;

        return list.stream().filter(i -> i%2 == 0).min(comp).orElse(0);
    }

    // A method that filters and count all even numbers from list of Integers using Stream API.
    private static Integer countOfEven(ArrayList<Integer> list){

        if(list.isEmpty()){
            return 0;
        }

        return Math.toIntExact(list.stream().filter(i -> i % 2 == 0).count());
    }

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("GEOFFREY");
        arrList.add("BARONY");
        arrList.add("BALCONY");
        arrList.add("BAROMETER ");
        arrList.add("THERMOMETER");
        System.out.println("\nList before converting: " +arrList);
        System.out.println("List after converting: " +convertCase(arrList));

        Integer[] arrInt = {0, 2, 20, 33, 21, 40, 45, 60, 100, 105, 404};
        ArrayList<Integer> listInteger = new ArrayList<>(Arrays.asList(arrInt));
        System.out.println("\nList of Integer before filtering: " +listInteger);
        System.out.println("\nEven numbers after filtering: " +evenNumbers(listInteger));
        System.out.println("\nCount of even numbers after filtering: " +countOfEven(listInteger));
        System.out.println("\nMax even number: " +maxEvenNumbers(listInteger));
        System.out.println("\nMin even number: " +minEvenNumbers(listInteger));

    }
}
