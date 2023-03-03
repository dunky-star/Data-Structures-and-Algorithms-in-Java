package datastructure.arraysinterviewquiz;

import java.util.Arrays;
import java.util.Collections;

/**
 * Given an array, write a function to get first, second best scores from the array.
 * Array may contain duplicates.
 *
 * Example
 *
 * myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
 * firstSecond(myArray) // 90 87
 */

public class BestScoreStudentMarks {
    public static void main(String[] args){
        Integer[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println("Best scores: " + firstSecond(myArray));

    }
    static String firstSecond(Integer[] myArray) {
        Integer[] arr = myArray;
        Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        Integer second = null;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != first) {
                second = arr[i];
                break;
            }
        }
        return first+" , "+second;

    }
}
