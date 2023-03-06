package datastructure;

public class QueuesUsingArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    protected QueuesUsingArray(int size){
        this.arr = new int[size];
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        this.size = size;
        System.out.println("The Circular queue is successfully created with size of: " + size);
    }


    // isEmpty
    protected boolean isEmpty() {
        if (topOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    // IsFull
    protected boolean isFull() {
        if (topOfQueue+1 == beginningOfQueue) {
            return true;
        } else if(beginningOfQueue == 0 && topOfQueue+1 == size){
            return true;
        } else {
            return false;
        }
    }

    // enQueue
    protected void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Circular Queue is full!");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted "+value+" in the queue");
        } else {
            if (topOfQueue+1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted "+value+" in the queue");
        }
    }

    // deQueue
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Circular Queue is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue+1 == size) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return result;
        }
    }


    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Circular Queue is empty.");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    // deleteQueue
    public void deleteQueue() {
        arr = null;
        System.out.println("The Circular Queue is successfully deleted!");
    }



    public static void main(String[] args){
        QueuesUsingArray newCircularQueue = new QueuesUsingArray(5);
        newCircularQueue.enQueue(200);
        newCircularQueue.enQueue(300);
        newCircularQueue.enQueue(400);
        newCircularQueue.enQueue(600);
        newCircularQueue.enQueue(1000);
        newCircularQueue.enQueue(6000);

    }
}
