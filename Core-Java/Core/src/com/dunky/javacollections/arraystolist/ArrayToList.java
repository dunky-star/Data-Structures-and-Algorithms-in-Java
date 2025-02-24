package com.dunky.javacollections.arraystolist;
/*
* We cannot perform an operation that tries to change size of the array.
* Eg: arrayList.add("Kampala");
*     arrayList.remove(2);
*     arrayList.add(2, "Gulu");
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
    // Convert to list and sort
    private static List<String> sortArray(String[] s){
        if(s == null || s.length == 0){
            return null;
        }
        List<String> arrayList = Arrays.asList(s);
        Collections.sort(arrayList);
        return arrayList;
    }
    public static void main(String[] args) {
        String[] s1 = {"opiyo", "geoffrey", "duncan", "coming to america", "gulu"};
        s1[2] = "kaligs";
        System.out.println(sortArray(s1));
    }
}
