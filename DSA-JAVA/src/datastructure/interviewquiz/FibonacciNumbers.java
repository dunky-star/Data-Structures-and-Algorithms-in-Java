package datastructure.interviewquiz;

/**
 * Write a program to return the next number in the series 0,1,1,3,5,8,13,...,n.
 */

// This problem is Fibonacci series.
public class FibonacciNumbers {

    public int fibonacci(int n){
        if (n == 0 || n == 1) return n;
        return fibonacci(n - 1) + fibonacci(n -2);
    }

    public static void main(String[] args){
        FibonacciNumbers fib = new FibonacciNumbers();
        var result = fib.fibonacci(3);
        System.out.println("Result: " + result);
    }
}
