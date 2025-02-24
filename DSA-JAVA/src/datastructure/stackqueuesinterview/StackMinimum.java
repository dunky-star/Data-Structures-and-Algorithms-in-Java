package datastructure.stackqueuesinterview;

/**
 * How would you design a stack which, in addition to push and pop,
 * has a function min which returns the minimum element? Push,
 * pop and min should all operate in O(1).
 */

public class StackMinimum {

    Node top;
    Node min;

    protected StackMinimum() {
        top = null;
        min = null;
    }

    // Linked List node.
    protected static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public int min() {
        return min.value;
    }

    public void push(int value) {
        if (min == null) {
            min = new Node(value, min);
        } else if (min.value < value) {
            min = new Node(min.value, min);
        } else {
            min = new Node(value, min);
        }
        top = new Node(value, top);
    }

    public int pop() {
        min = min.next;
        int result = top.value;
        top = top.next;
        return result;
    }

    public static void main(String[] args){
        StackMinimum stackMin = new StackMinimum();
        stackMin.push(3);
        stackMin.push(5);
        stackMin.push(6);
        stackMin.push(8);
        stackMin.push(2);
        System.out.println(stackMin.min());
    }


}
