package com.dunky.arraysearch;

public class ArraySearch {
    public int search(String strToMatch, String[] strArray){
        for (int i = 1; i < strArray.length; i++){
            if (strArray[i].equals(strToMatch)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        ArraySearch arraySearch = new ArraySearch();
        System.out.println(arraySearch.search("Alien", new String[]{"District 9", "Interstellar",
        "Blade runner", "Alien", "Minority report", "Primer"}));
    }

}
