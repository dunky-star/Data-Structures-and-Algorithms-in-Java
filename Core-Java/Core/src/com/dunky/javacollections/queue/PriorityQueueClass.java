package com.dunky.javacollections.queue;

/*
* Priority Queue doesn't quarantee order once we start removing elements.
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<Integer>();
        System.out.println(q.peek());
       // System.out.println(q.element());
        for (int i = 20; i <= 30; i++) {
            q.offer(i);
        }
        System.out.println("Elements in queue: " +q);
        System.out.println(q.poll()); // Remove an element from the head.
        System.out.println(q.remove());
        System.out.println(q);
    }
}
