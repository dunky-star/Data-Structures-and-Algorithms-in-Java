package datastructure;

public class StackUsingArray {
    public static void main(String[] args){
        StackUsingArray newStackArray = new StackUsingArray(5);
    }
    int[] arr;
    int topOfStck;

    public StackUsingArray(int size){
        this.arr = new int[size];
        this.topOfStck = -1;
        System.out.println("The stack is created with size of: " + size);
    }
}
