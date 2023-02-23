package datastructure.misc.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    // Inner class
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

        // Constructor
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void append(int value){}
    public void prepend(int value){}
    // public boolean insert(int index, int value){}
}
