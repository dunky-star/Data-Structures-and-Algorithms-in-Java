package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
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
        // System.out.println("\nThe color of Cookie 1 is: " + myCookie1.getColor()
        // + " \nand the color of Cookie 2 is: " + myCookie2.getColor());


        // Pointers
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value ", 100);
        map2 = map1;
        map1.put("value ", 1000);
        System.out.println(map1);
        System.out.println(map2);


        // Linked List
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(3);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        System.out.println("Before prepend():");
        System.out.println("-----------------");
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        System.out.println("\nLinked List:");
        linkedList.printList();

        linkedList.prepend(1);
        linkedList.set(1, 15);
        linkedList.insert(4, 20);

        System.out.println("\nAfter prepend() and set():");
        System.out.println("----------------");
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        System.out.println("\nLinked List:");
        linkedList.printList();

        System.out.println("My linked list index with value of 2: "
                + linkedList.get(2).value + "\n");

        linkedList.reverse();

        System.out.println("\nLL after reverse():");
        linkedList.printList();

        // Doubly Linked List
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(3);
        myDLL.append(5);
        myDLL.prepend(1);
        System.out.println("----------------");
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();

    }
}