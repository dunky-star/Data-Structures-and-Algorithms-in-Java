package com.dunky.multithreading;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    int num;

    MyCallable(int num){
        this.num = num;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() +
                " Is calculating the sum of all numbers upto n: " +num);
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
