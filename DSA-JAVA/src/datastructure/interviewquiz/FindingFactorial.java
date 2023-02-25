package datastructure.interviewquiz;

/**
 * Finding factorial of a number.
 */

public class FindingFactorial {
    public static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args){
       System.out.println("The factorial is: " + factorial(5)) ;
    }
}
