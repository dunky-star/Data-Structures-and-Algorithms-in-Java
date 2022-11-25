package datastructure.misc.big_o;

public class Main {
    // O(n)
    // O(n+n)
    public static void printItemsn(int n){
        for(int i=0; i < n; i++){
            System.out.println(i);
        }
        for(int j=0; j < n; j++){
            System.out.println(j);
        }
    }

    // O(n^3)
    public static void printItemsn_n(int n){
        for(int i=0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k=0; k < n; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }

    }

    public static void main(String[] args){
        /*
        * System.out.println("The Big O(n): ");
        * printItemsn(10);
        */
        System.out.println("The Big O(n^2): ");
        printItemsn_n(10);
    }
}