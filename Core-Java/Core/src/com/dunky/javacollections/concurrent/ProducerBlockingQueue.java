package com.dunky.javacollections.concurrent;

/*
* Blocking Queue helps in the realization of producer/consumer pattern.
*
* 1. PUT
* 2. TAKE
*/

import java.util.concurrent.BlockingQueue;

public class ProducerBlockingQueue implements Runnable{

    private BlockingQueue<String> queue;

    public ProducerBlockingQueue(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("Hp Laptop order");
            queue.put("Dell Laptop order");
            queue.put("iPhone order");
            queue.put("Samsung order");
        } catch (InterruptedException e) {
            System.out.println("Operation interrupted");
        }
    }

}
