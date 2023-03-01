package datastructure.recursioninterview;

/**
 * Power of two
 */

public class PowerOfTwo {
public static void main(String[] args){
    System.out.println("The power of two: " + powerOf2(100));
}
public static int powerOf2(int n){
    if(n<1){
        return 0;
    } else if (n==1) {
        return 1;
    }else{
        int prev = powerOf2(n/2);
        int curr = prev*2;
        return curr;
    }
  }
}
