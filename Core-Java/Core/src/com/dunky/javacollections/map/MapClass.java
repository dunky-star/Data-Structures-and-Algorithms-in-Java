package com.dunky.javacollections.map;

/*
* Map is an interface on its own and does not implement Collection interface.
* Map is implemented by several classes like HashMap, IdentityHashMap, WeakHashMap and
* it is also extended by an interface called [SortedMap] which internally is extended by
* NavigableMap which is finally implemented by TreeMap (Sorted).
*
 */

import java.util.*;


public class MapClass {

    private static boolean mapContains(SortedMap<String, Integer> map, String key){
        return map.containsKey(key);
    }


    public static void main(String[] args) {

        NavigableMap<String, Integer> student = new TreeMap<String, Integer>();

        student.put("Geoffrey Duncan", 99);
        student.put("Tonny Kakooza", 90);
        student.put("Hillary Arinda", 95);
        student.put("Suzan Alvaron", 89);
        student.put("Collins Kabwama", 97);
        student.put("Billy Blank", 96);
        student.put("Ivan A", 95);
        student.put("Deo Mugabe", 95);
        //System.out.println(student);

        // Finding the size of a TreeMap
        System.out.println("\nTotal number of students : " + student.size() + "\n");

        for(Map.Entry<String, Integer> entry : student.entrySet()){
            System.out.println(entry.getKey() + " scored " + entry.getValue() + "%");
        }

        /*
        * To sort by values
        */
        // Create a list from the entry set of the TreeMap
        List<Map.Entry<String, Integer>> list = new ArrayList<>(student.entrySet());
        //System.out.println(list);

        // Sort the list by values using a custom comparator
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        System.out.println(list);

        // Create a new TreeMap using the sorted list
        HashMap<String, Integer> sortedTreeMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : list) {
            sortedTreeMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted TreeMap by value
        System.out.println("\nSORTED STUDENTS BY SCORE: ");
        System.out.println("******************");
        for (Map.Entry<String, Integer> entry : sortedTreeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Searching the map for a key, value
        System.out.println("\nSEARCHING STUDENT: ");
        System.out.println("******************");
        String key = "Geoffrey Duncan";
        boolean hasStudent = mapContains(student,  key);
        if(hasStudent){
            System.out.println("Student with name " + key + " found");
        } else{
            System.out.println("Student with name " + key + " not found");
        }

        // Find the first and last entry
        System.out.println("First entry in student map : " + student.firstEntry());
        System.out.println("Last entry in student map : " + student.lastEntry());

        // Remove the first entry from the TreeMap
        Map.Entry<String, Integer> firstEntry = student.pollFirstEntry();
        System.out.println("Removed firstEntry : " + firstEntry + ", New TreeMap : " + student);

        // Remove the last entry from the TreeMap
        Map.Entry<String, Integer> lastEntry = student.pollLastEntry();
        System.out.println("Removed lastEntry : " + lastEntry + ", New TreeMap : " + student);
    }

}
