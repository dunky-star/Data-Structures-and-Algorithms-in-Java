package datastructure.misc.big_o;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Big O(n)
    public static void printItem_n(int n){
        for(int i=0; i < n; i++){
            System.out.println(i);
        }

    }
    // Big O(n+n) = O(2n)
    public static void printItems_n(int n){
        for(int i=0; i < n; i++){
            System.out.println(i);
        }
        for(int j=0; j < n; j++){
            System.out.println(j);
        }
    }

    // Big O(n^3)
    public static void printItems_n_n(int n){
        for(int i=0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k=0; k < n; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }

    }

    // Big O(1)
    public static int addItems(int n){
        return n + n + n;
    }

    // Big O(a + b): Different terms for input.
    public static void printItem_a_b(int a, int b){
        for(int i=0; i < a; i++){
            System.out.println(i);
        }
        for(int j=0; j < b; j++){
            System.out.println(j);
        }
    }

    // Big O(a * b): Different terms for input.
    public static void printItem_axb(int a, int b){
          for(int i=0; i < a; i++) {
              for (int j = 0; j < b; j++) {
                  System.out.println(i + " " + j);
              }
          }
    }

    public static void main(String[] args){

        // System.out.println("The Big O(n): ");
        // printItem_n(10);

        // System.out.println("The Big O(n^2): " + printItems_n_n(10));


        // System.out.println("The Big O(1): " + addItems(10));
        System.out.println("The Big O(a * b): ");
        printItem_axb(5, 8);

        // Big O(ArrayList): ArrayList - adding or removing an element is O(1)
        // Removing index as well as adding by index is O(n) -> leads to reindexing.
        List<Integer> myList = new ArrayList<>();
        myList.add(11);
        myList.add(3);
        myList.add(33);
        myList.add(7);
        System.out.println("*****************************");
        System.out.println(myList);
        myList.remove(0);
        System.out.println("List after removing an item at index 0");
        System.out.println("*****************************");
        System.out.println(myList);
        myList.add(0, 200);
        System.out.println("List after adding 200 at index 0");
        System.out.println("*****************************");
        System.out.println(myList);

        Cookie myCookie1 = new Cookie("Green");
        Cookie myCookie2 = new Cookie("Red");
        System.out.println("The color of Cookie 1 is: " + myCookie1.getColor());

    }
}