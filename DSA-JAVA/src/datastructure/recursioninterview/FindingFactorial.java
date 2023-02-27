package datastructure.recursioninterview;

/**
 * Finding factorial of a number.
 * Write a function factorial which accepts a number and returns the factorial
 * of that number. A factorial is the product of an integer and all the integers below it; e.g.,
 * factorial four ( 4! ) is equal to 24, because 4 * 3 * 2 * 1 equals 24.
 * factorial zero (0!) is always 1.
 */

public class FindingFactorial {
    public static int factorial(int n){
        if (n < 0) return -1;
        if(n == 1 || n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args){
       System.out.println("The factorial is: " + factorial(10)) ;
    }
}
