package com.dunky.java8features.lambdas;

public class TestRunnable {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }

        });

        t.start();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            System.out.println("Main Thread: " + i);
        }
    }
}
