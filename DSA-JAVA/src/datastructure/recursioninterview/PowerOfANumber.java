package datastructure.recursioninterview;

/**
 * How to calculate power of a number using recursion?
 * X(pow)(n) = X * X * X * ..(n times).. * X
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
