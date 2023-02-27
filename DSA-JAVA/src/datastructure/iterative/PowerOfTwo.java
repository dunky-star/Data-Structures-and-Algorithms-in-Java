package datastructure.iterative;

public class PowerOfTwo {

    public static int PowerOfTwoIterative(int n){
        int i = 0;
        int power = 1;
        while (i < n){
            power = power * 2;
            i += 1;
        }
        return power;
    }

    public static void main(String[] args){
        System.out.println("The power of 2: " + PowerOfTwoIterative(10));
    }
}
