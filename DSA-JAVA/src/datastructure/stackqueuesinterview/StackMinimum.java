package datastructure.stackqueuesinterview;

/**
 * How would you design a stack which, in addition to push and pop,
 * has a function min which returns the minimum element? Push,
 * pop and min should all operate in O(1).
 */

public class StackMinimum {

    protected static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
