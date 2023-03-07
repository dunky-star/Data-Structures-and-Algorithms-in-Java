package datastructure.algorithms.dividenconquer;

/**
 * Problem statement:
 * Given N, find the number of ways to express N as a sum of 1, 3 and 4
 */

public class NumberFactor {
    public int waysToGetN(int n) {
        if ((n==0) || (n==1) || (n==2)) {
            return 1;
        }
        if (n == 3) {
            return 2; //{1,1,1} {3}
        }
        int sub1 = waysToGetN(n-1);
        int sub2 = waysToGetN(n-3);
        int sub3 = waysToGetN(n-4);

        return sub1+sub2+sub3;

    }

    public static void main(String[] args){
        NumberFactor nf = new NumberFactor();
        System.out.println(nf.waysToGetN(4));
        System.out.println(nf.waysToGetN(5));
        System.out.println(nf.waysToGetN(6));
    }
}

