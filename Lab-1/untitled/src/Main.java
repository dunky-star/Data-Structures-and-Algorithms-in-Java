/*
* Write a Java program to calculate the Greatest Common Divisor of two numbers;
 */
public class Main {
    private static int gcd(int m, int n){
        if (m == 0){
            return n;
        }
        int r;
        while (n != 0){
            r = m%n;
            m = n;
            n = r;
        }
        return m;
    }
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        System.out.println("GCD of: " + gcd(a, b));
    }
}