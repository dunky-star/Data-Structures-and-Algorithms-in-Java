package datastructure;

// We use ArrayList or Linked List for implementing Stack data structure.

public class Stacks {
    // private member variables.
    private Node top;
    private int height;

    // Inner class for node
    static class Node{
        int value;
        Node next;

        Node (int value){
            this.value = value;
        }
    }

    // Stack, Queue Constructor
    public Stacks(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack(){
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop(){
        if (top == null) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
    }
    public void getHeight(){
        System.out.println("Height: " + height);
    }

    // Adding a node to a stack
    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;

        height--;
        return temp;
    }


}
