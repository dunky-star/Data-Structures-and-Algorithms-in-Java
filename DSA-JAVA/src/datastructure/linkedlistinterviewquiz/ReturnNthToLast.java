package datastructure.linkedlistinterviewquiz;

/**
 * Implement an algorithm to find the nth to last element of a singly linked list.
 *
 * Example:
 *
 * linkedList = 1->2->3->4-5
 * nthToLast(linkedList, 2)
 * //Output
 * 4
 */

public class ReturnNthToLast {

    // Question for - Nth to Last
    protected Node nthToLast(LinkedList ll, int n) {
        Node p1 = ll.head;
        Node p2 = ll.head;
        for (int i = 0 ; i<n; i++) {
            if (p2 == null) return null;
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
