package datastructure.linkedlistinterviewquiz;

import java.util.HashSet;

/**
 * Write a method to remove duplicates from an unsorted linked list.
 *
 * Example:
 *
 * linkedList = 1->2->1->3
 * deleteDups(linkedList)
 * //Output
 * 1->2->3
 */

public class RemoveDuplicates {
    void deleteDups(LinkedList ll) {
        HashSet<Integer> hs = new HashSet();
        Node current = ll.head;
        Node prev = null;
        while (current != null) {
            int curval = current.value;
            if (hs.contains(curval)) {
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }
}
