package datastructure;

public class StackUsingArray {
     int[] arr;
    int topOfStack;

    protected StackUsingArray(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of: " + size);
    }

    // isEmpty
    protected boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }else{
            return false;
        }
    }

    // isFull
    protected boolean isFull(){
        if(topOfStack == arr.length -1){
            System.out.println("The stack is full");
            return true;
        }else{
            return false;
        }
    }

    // Push
    protected void push(int value){
        if(isFull()){
            System.out.println("The stack is full");
        }else{
            arr[topOfStack +1] = value;
            topOfStack++;
        }
    }

    // Pop
    protected int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    // Main method - program entry point.
    public static void main(String[] args){
        StackUsingArray newStackArray = new StackUsingArray(5);
        newStackArray.push(10);
        newStackArray.push(25);
        newStackArray.push(5);
        newStackArray.push(40);
        int result = newStackArray.pop();
        System.out.println("Pop out: " + result);
    }
}
