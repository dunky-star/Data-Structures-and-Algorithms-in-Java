package datastructure;

public class StackUsingArray {
     int[] arr;
    int topOfStck;

    protected StackUsingArray(int size){
        this.arr = new int[size];
        this.topOfStck = -1;
        System.out.println("The stack is created with size of: " + size);
    }

    // isEmpty
    protected boolean isEmpty(){
        if(topOfStck == -1){
            return true;
        }else{
            return false;
        }
    }

    // isFull
    protected boolean isFull(){
        if(topOfStck == arr.length -1){
            System.out.println("The stack is full");
            return true;
        }else{
            return false;
        }
    }

    // Main method - program entry point.
    public static void main(String[] args){
        StackUsingArray newStackArray = new StackUsingArray(5);
        boolean result = newStackArray.isFull();
        System.out.println("Stack is Full: " + result);
    }
}
