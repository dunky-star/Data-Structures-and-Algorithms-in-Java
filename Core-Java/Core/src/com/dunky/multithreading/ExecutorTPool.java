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

public class ExecutorTPool implements Runnable {

    String name;

    ExecutorTPool(String name){
        this.name = name;
    }


    @Override
    public void run() {
        printStatus();
    }

    private void printStatus(){
        System.out.println(name + " Check processor has begun processing the check "
                + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Program error occurred while checking processor has begun processing the check "
                    + Thread.currentThread().getName());
        }
        System.out.println(name + " Check processor has completed processing the check "
                + Thread.currentThread().getName());
    }
}
