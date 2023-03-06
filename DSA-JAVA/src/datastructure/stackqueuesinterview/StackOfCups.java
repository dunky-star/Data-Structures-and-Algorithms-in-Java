package datastructure.stackqueuesinterview;

import java.util.EmptyStackException;

/**
 * Imagine a (literal) stack of Cups. If the stack gets too high, it might topple.
 * Therefore, in real life, we would likely start a new stack when the previous stack exceeds
 * some threshold. Implement a data structure StackOfCups that mimics this. StackOfCups
 * should be composed of several stacks and should create a new stack once the previous one
 * exceeds capacity, StackOfCups.push() and StackOfCups.pop() should behave identically
 * to a single stack (that is, pop( ) should return the same values as it would if there
 * were just a single stack).
 *
 * Follow Up:
 *
 * Implement a function popAt (int index) which performs a pop operation on a specific
 * sub - stack.
 */

public class StackOfCups {

    private int capacity;
    public Node top;
    public Node bottom;
    public int size = 0;

    public StackOfCups(int capacity){
        this.capacity = capacity;
    }

    public static class Node{
        public Node above;
        public Node below;
        public int value;

        public Node(int value){
            this.value = value;
        }

    }

    // isFull
    public boolean isFull(){
        return capacity == size;
    }

    // Joining two stacks
    public void join(Node above, Node below){
        if(below !=  null) below.above = above;
        if(above != null) above.below = below;
    }

    // Push method
    public boolean push(int v){
        if (size>= capacity) return false;
        size++;
        Node newNode = new Node(v);
        if(size == 1) bottom = newNode;
        join(newNode, top);
        top = newNode;
        return true;
    }

    // Pop method
    public int pop(){
        if(top == null) throw new EmptyStackException();
        int result = top.value;
        top = top.below;
        size--;
        return result;
    }

    // Pop method
    public int peek(){
        if(top == null) throw new EmptyStackException();
        int result = top.value;
        top = top.below;
        return result;
    }

    // Main method
    public static void main(String[] args){
        StackOfCups newCups = new StackOfCups(4);
        newCups.push(23);
        newCups.push(20);
        newCups.push(21);
        newCups.push(22);
        newCups.push(24);
        newCups.push(30);
        System.out.println(newCups.isFull());
        System.out.println(newCups.peek());

    }


}
