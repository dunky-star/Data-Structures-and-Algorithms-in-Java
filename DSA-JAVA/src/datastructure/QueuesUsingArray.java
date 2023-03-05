package datastructure;

public class QueuesUsingArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueuesUsingArray(int size){
        this.arr = new int[size];
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("The queue is successfully created with size of: " + size);
    }

    // IsFull
    public boolean isFull() {
        if (topOfQueue == arr.length-1) {
            return true;
        } else {
            return false;
        }
    }

    // isEmpty
    public boolean isEmpty() {
        if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length)) {
            return true;
        } else {
            return false;
        }
    }
    // Enqueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full!");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Succesffully inserted "+value+ " in the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Succesffully inserted "+value+ " in the queue");
        }
    }

    // deQeueue
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    // Peek
    public int peek() {
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("The Queue is empty!");
            return -1;
        }
    }

    //delete

    public void deleteQueue() {
        arr = null;
        System.out.println("The Queue is successfully deleted!");
    }


    public static void main(String[] args){
        QueuesUsingArray newQueue = new QueuesUsingArray(5);
        newQueue.enQueue(200);
        newQueue.enQueue(300);
        newQueue.enQueue(400);
        newQueue.enQueue(600);
        newQueue.enQueue(1000);

    }
}
