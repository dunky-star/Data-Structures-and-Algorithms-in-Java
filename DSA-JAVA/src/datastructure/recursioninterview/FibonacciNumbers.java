package datastructure.recursioninterview;

/**
 * Write a program to return a number in the series 0,1,1,3,5,8,13,...,n.
 * Write a recursive function called fib which accepts a number and returns
 * the nth number in the Fibonacci sequence. Recall that the Fibonacci sequence is the sequence
 * of whole numbers 0,1, 1, 2, 3, 5, 8, ... which starts with 0 and 1,
 * and where every number thereafter is equal to the sum of the previous two numbers.
 */

// This problem is Fibonacci series.
public class FibonacciNumbers {

    public int fib(int n){
        if (n < 0) return -1;
        if (n == 0 || n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args){
        FibonacciNumbers fibonacci = new FibonacciNumbers();
        int result = fibonacci.fib(6);
        System.out.println("Result: " + result);
    }
}
