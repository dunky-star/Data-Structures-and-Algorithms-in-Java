package datastructure.recursioninterview;

/**
 * How to find GCD of two numbers using recursion?
 * Eg. GCD(8,12) = 4
 * Best way is using Euclidean Algorithm.
 */

public class GreatestCommonDivisor {
    
    public static void main(String[] args){
      System.out.println("GCD: " + gcd(8, 4));
    }

    public static int gcd(int a, int b ){
        if ( a < 0 || b < 0 ) return -1;
        if (b == 0) return a;
        return gcd(b, a%b);
    }


}
