package datastructure;

// We use ArrayList or Linked List for implementing Stack data structure.

public class StacksQueues {
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
    public StacksQueues(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack(){
        Node temp = top;
        if (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: " + top.value);
    }
    public void getHeight(){
        System.out.println("Height: " + height);
    }


}
