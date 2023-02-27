package datastructure.recursioninterview;

/**
 * How to find the sum of digits of a positive integer number using recursion?
 */
public class SumOfDigits {

    public static void main(String[] args){
        System.out.println("Sum of Digits: " + sumOfDigit(255));
    }

    // Question: Sum of digits of a positive integer number using recursion.
    public static int sumOfDigit(int n){
        if (n < 0 || n == 0 ) return 0;
        return n%10 + sumOfDigit(n/10);
    }

}
