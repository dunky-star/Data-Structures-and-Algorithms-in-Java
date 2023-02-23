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

    // Getter & setter


    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value){}
    public void prepend(int value){}
    // public boolean insert(int index, int value){}

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
