package com.dunky.javacollections.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorNav {

    // Print in forward direction
    private static void traverseForward(LinkedList<String> ll) {
        if(ll.isEmpty()){
            System.out.println("List is empty");
            return;
        }
        ListIterator<String> itr = ll.listIterator();
        while(itr.hasNext()){
            String value = itr.next();
            System.out.println(value);
        }
    }

    // Print in backward direction (Reverse items in a Linked List)
    private static void traverseBackward(LinkedList<String> ll) {
        if(ll.isEmpty()){
            System.out.println("List is empty");
            return;
        }
        ListIterator<String> itr = ll.listIterator(ll.size());
        while(itr.hasPrevious()){
            String value = itr.previous();
            System.out.println(value);
        }
    }

    // Return second last item in the LinkedList
    private static String secondLastItem(LinkedList<String> ll) {
        if(ll.size() < 2){
            System.out.println("List doesn't contain second last item.");
            return null;
        }

        return ll.get(ll.size() - 2); // Get the element at index size() - 2
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<String>();
        linkedList1.add("Abc");
        linkedList1.add("Mno");
        linkedList1.add("Geoffrey");
        linkedList1.add("Lamy");
        linkedList1.add("Penny");
        System.out.println("\nFORWARD traversal:");
        System.out.println("==================");
        traverseForward(linkedList1);

        System.out.println("\nBACKWARD traversal:");
        System.out.println("==================");
        traverseBackward(linkedList1);

        System.out.println("\nSecond last item in the LinkedList:");
        System.out.println("==================");
        String value = secondLastItem(linkedList1);
        System.out.println("Second last item: " +value);
    }
}
