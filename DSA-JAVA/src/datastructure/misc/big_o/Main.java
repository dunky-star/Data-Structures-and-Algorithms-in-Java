package datastructure.misc.big_o;

public class Main {
    // O(n)
    // O(n+n)
    public static void printItems(int n){
        for(int i=0; i < n; i++){
            System.out.println(i);
        }
        for(int j=0; j < n; j++){
            System.out.println(j);
        }
    }

    public static void main(String[] args){
        printItems(10);
    }
}