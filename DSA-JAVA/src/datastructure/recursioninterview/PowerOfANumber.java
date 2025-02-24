package datastructure.recursioninterview;

/**
 * How to calculate power of a number using recursion?
 * X(pow)(n) = X * X * X * ..(n times).. * X
 * Write a function called power which accepts a base and an exponent.
 * The function should return the power of the base to the exponent.
 * This function should mimic the functionality of math.pow() -
 * do not worry about negative bases and exponents.
 */

public class PowerOfANumber {

    public static void main(String[] args){
        System.out.println("Power: " + power(2, -2));
    }

    public static int power (int base, int exp){
        if (exp < 0) return -1;
        if (exp == 0 ) return 1;
        return base * power (base,exp -1);
    }
}
