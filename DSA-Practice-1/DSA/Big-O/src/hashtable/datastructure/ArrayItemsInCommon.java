package hashtable.datastructure;

// Write a function to check if two arrays contain items in common.

import java.util.HashMap;

public class ArrayItemsInCommon {

    private static boolean itemsInCommon(int[] arr1, int[] arr2){
        if (arr1.length == 0 || arr2.length == 0){
            return false;
        }
        HashMap<Integer, Boolean> myMap = new HashMap<Integer, Boolean>();

        for(int i : arr1){
            myMap.put(i, true);
        }

        for( int j : arr2){
            if(myMap.get(j) != null) return true;
        }

        return false;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 5};
        System.out.println("The two arrays contain items in common: " +itemsInCommon(arr1, arr2));
    }
}
