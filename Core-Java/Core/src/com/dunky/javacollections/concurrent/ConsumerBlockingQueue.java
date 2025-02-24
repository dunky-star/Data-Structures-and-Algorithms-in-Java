package com.dunky.javacollections.concurrent;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable{

    private BlockingQueue<String> queue;

    public ConsumerBlockingQueue(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            System.out.println("Operation interrupted");
        }
    }
}
