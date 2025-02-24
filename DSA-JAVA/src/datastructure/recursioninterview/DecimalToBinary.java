package datastructure.recursioninterview;

/**
 * How to convert a number from decimal to binary using recursion?
 */

public class DecimalToBinary {

    public static void main(String[] args){
        System.out.println("Decimal to Binary: " + decimalToBinary(10));
    }

    public static int decimalToBinary(int n){
        if (n == 0) return 0;
        return n%2 + 10 * decimalToBinary(n/2);
    }
}
