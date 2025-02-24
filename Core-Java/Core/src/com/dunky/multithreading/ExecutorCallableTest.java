package com.dunky.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallableTest {

    public static void main(String[] args) {
        // Thread pool on Array of object.
        ExecutorTPool[] fintechPools = {new ExecutorTPool("ATM"), new ExecutorTPool("Bank"),
                new ExecutorTPool("MobileMoney"),  new ExecutorTPool("Web") };

        ExecutorService fintechService = Executors.newFixedThreadPool(4);

        for(ExecutorTPool tPool : fintechPools){
            Future<?> f = fintechService.submit(tPool);
            try {
                f.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        fintechService.shutdown();

        // Calculating the sum of all numbers upto n using Callable
        MyCallable[] myCallables = {new MyCallable(10), new MyCallable(20),
                new MyCallable(30), new MyCallable(40), new MyCallable(50)
        };
        ExecutorService myCallableService = Executors.newFixedThreadPool(3);
        for(MyCallable myCallable : myCallables){
            Future<Integer> f_call = myCallableService.submit(myCallable);
            try {
                System.out.println(f_call.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        myCallableService.shutdown();
    }


}
