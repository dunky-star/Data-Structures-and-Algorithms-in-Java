package com.dunky.multithreading;
/*
* There are two ways to run a thread in Java, either by implementing Runnable Interface
* or extending Thread class.
*
* LIMITATION:
* 1. Time-consuming
* 2. Poor resource management
* 3. Not robust
*
* SOLUTION:
* Java Executor Framework - Thread Pool - Creates a pool of worker threads which can be assigned as required.
*/

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MultiThreaded implements Runnable{

    public static void main(String[] args) {
        // Using Thread pool (Executor Framework).
        Executor e = Executors.newCachedThreadPool();

        MultiThreaded mt = new MultiThreaded();
        Thread t = new Thread(mt);
        // Invoke run method internally.
        t.start();
        mt.printK();
    }

    @Override
    public void run(){
      printI();
      printJ();
    }

    private void printI(){
        synchronized (this) {
            for (int i = 1; i <= 200; i++) {
                System.out.print("i: " + i + "\t");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Child Thread1 exiting");
                }
            }
        }
    }

    private void printJ(){
        for(int j = 1; j <= 200; j++){
            System.out.print("j: " + j + "\t");
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Child Thread2 Exiting...");
            }
        }
    }
    private void printK(){
        synchronized (this) { // Thread lock
            for (int k = 1; k <= 200; k++) {
                System.out.print("k: " + k + "\t");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Child Thread3 Exiting...");
                }
            }
        }
    }

}
