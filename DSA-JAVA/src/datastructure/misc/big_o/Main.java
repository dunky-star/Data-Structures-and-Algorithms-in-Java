package datastructure.misc.big_o;

public class Main {
    // Big O(n)
    public static void printItem_n(int n){
        for(int i=0; i < n; i++){
            System.out.println(i);
        }

    }
    // Big O(n+n)
    public static void printItems_n(int n){
        for(int i=0; i < n; i++){
            System.out.println(i);
        }
        for(int j=0; j < n; j++){
            System.out.println(j);
        }
    }

    // Big O(n^3)
    public static void printItems_n_n(int n){
        for(int i=0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k=0; k < n; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }

    }

    // Big O(1)
    public static int addItems(int n){
        return n + n + n;
    }

    // Big O(a + b)
    public static void printItem_a_b(int a, int b){
        for(int i=0; i < a; i++){
            System.out.println(i);
        }
        for(int j=0; j < b; j++){
            System.out.println(j);
        }
    }

    public static void main(String[] args){

        // System.out.println("The Big O(n): ");
        // printItem_n(10);

        // System.out.println("The Big O(n^2): " + printItems_n_n(10));


        // System.out.println("The Big O(1): " + addItems(10));
        System.out.println("The Big O(a + b): ");
        printItem_a_b(5, 8);
    }
}