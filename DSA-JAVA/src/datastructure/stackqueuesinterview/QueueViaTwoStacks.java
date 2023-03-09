package datastructure.stackqueuesinterview;

import java.util.Stack;

/**
 * Implement Queue class which implements a queue using two stacks.
 */

public class QueueViaTwoStacks {
    Stack<Integer> stackNewest, stackOldest;

    public QueueViaTwoStacks(){
        stackNewest = new Stack<Integer>();
        stackOldest = new Stack<Integer>();
    }

    // Finding total size of two stack for queue.
    public int size(){
        return stackNewest.size() + stackOldest.size();
    }

    // Enqueuing operation
    public void enqueue(int value){
        stackNewest.push(value);
    }

    // Helper function to shift elements from newestStack to oldestStack.
    private void shiftStacks(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                int poppedOut = stackNewest.pop();
                stackOldest.push(poppedOut);
            }
        }
    }

    // Dequeue method
    public int dequeue(){
        shiftStacks();
        return stackOldest.pop();
    }

    // Displays an element without removing
    public int peek(){
        shiftStacks();
        return stackOldest.peek();
    }

    // Main method
    public static void main(String[] args){
        QueueViaTwoStacks newQueue = new QueueViaTwoStacks();
        newQueue.enqueue(10);
        newQueue.enqueue(40);
        newQueue.enqueue(60);
        newQueue.enqueue(100);
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue.peek());
        newQueue.enqueue(1000);
        System.out.println(newQueue.peek());

    }
}
