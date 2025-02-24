package datastructure.stackqueuesinterview;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Imagine a (literal) stack of Cups. If the stack gets too high, it might topple.
 * Therefore, in real life, we would likely start a new stack when the previous stack exceeds
 * some threshold. Implement a data structure Stacks that mimics this. Stacks
 * should be composed of several stacks and should create a new stack once the previous one
 * exceeds capacity, Stacks.push() and Stacks.pop() should behave identically
 * to a single stack (that is, pop( ) should return the same values as it would if there
 * were just a single stack).
 *
 * Follow Up:
 *
 * Implement a function popAt (int index) which performs a pop operation on a specific
 * sub - stack.
 */

public class Stacks {

    private int capacity;
    public Node top;
    public Node bottom;
    public int size = 0;

    public Stacks(int capacity){
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

    public int removeBottom(){
        Node b = bottom;
        bottom = bottom.above;
        if(bottom != null) bottom.below = null;
        size--;
        return b.value;
    }

    // Main method
    public static void main(String[] args){
        SetOfStacks newCups = new SetOfStacks(3);
        newCups.push(23);
        newCups.push(20);
        newCups.push(21);
        newCups.push(22);
        newCups.push(24);
        newCups.push(30);
        System.out.println(newCups.popAt(0));
        System.out.println(newCups.popAt(0));

    }


}

class SetOfStacks{

    public int capacity;
    ArrayList<Stacks> stacking = new ArrayList<Stacks>();

    public SetOfStacks(int capacity){
        this.capacity = capacity;
    }

    public Stacks getLastStack(){
        if(stacking.size() == 0){
            return null;
        }
        return stacking.get(stacking.size()-1);
    }

    public void push(int v){
        Stacks last = getLastStack();
        if(last != null && !last.isFull()){
            last.push(v);
        }else {
            Stacks stack = new Stacks(capacity);
            stack.push(v);
            stacking.add(stack);
        }
    }

    public int pop(){
        Stacks last = getLastStack();
        if(last == null) throw new EmptyStackException();
        int result = last.pop();
        if(last.size == 0){
            stacking.remove(stacking.size()-1);
        }
        return result;
    }

    // Helper left shift
    public int leftShift(int index, boolean removeTop){
        Stacks stacks = stacking.get(index);
        int removeItem;
        if(removeTop) removeItem = stacks.pop();
        else removeItem = stacks.removeBottom();
        if(stacks.size == 0){
            stacking.remove(index);
        }else if(stacks.size > index+1){
            int v = leftShift(index+1, false);
            stacks.push(v);
        }
        return removeItem;
    }

    public int popAt(int index){
        return leftShift(index, true);
    }


}
