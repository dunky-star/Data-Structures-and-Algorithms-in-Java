package datastructure.recursioninterview;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Write a program to return a number in the series 0,1,1,3,5,8,13,...,n.
 * Write a recursive function called fib which accepts a number and returns
 * the nth number in the Fibonacci sequence. Recall that the Fibonacci sequence is the sequence
 * of whole numbers 0,1, 1, 2, 3, 5, 8, ... which starts with 0 and 1,
 * and where every number thereafter is equal to the sum of the previous two numbers.
 */

// This problem is Fibonacci series using memoization.
public class FibonacciNumbers {

    // Fibonacci with Memoization
    public static int fibMemo(int n, HashMap<Integer, Integer> memo){
        if(n == 1) return 0;

        if(n == 2) return 1;

        if(!memo.containsKey(n)){
            memo.put(n, (fibMemo(n-1, memo) + fibMemo(n-2, memo)));
        }
        return memo.get(n);

    }

    // Fibonacci with tabulation approach.
    public static int fibTab(int n){
        ArrayList<Integer> tb = new ArrayList<Integer>();
        tb.add(0);
        tb.add(1);
        for (int i = 2; i <= n - 1; i++){
            int n1 = tb.get(i-1);
            int n2 = tb.get(i-2);
            tb.add(n1+n2);
        }
        return tb.get(n-1);
    }

    // Main method
    public static void main(String[] args){

        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        System.out.println("Result using memoization: " + fibMemo(6, memo));
        System.out.println("Result using tabulation approach: " + fibTab(6));
    }
}
