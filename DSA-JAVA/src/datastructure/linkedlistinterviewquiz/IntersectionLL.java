package datastructure.linkedlistinterviewquiz;

/**
 * Given two (singly) linked lists, determine if the two lists intersect.
 * Return the intersecting node. Note that the intersection is defined based on reference,
 * not value. That is, if the kth node of the first linked list is the exact same node
 * (by reference) as the jth node of the second linked list, then they are intersecting.
 */

public class IntersectionLL {

    // getKthNode
    Node getKthNode(Node head, int k) {
        Node current = head;
        while (k>0 && current != null) {
            current = current.next;
            k--;
        }
        return current;
    }

    // Intersection Method
    Node findIntersection(LinkedList list1, LinkedList list2) {
        if (list1.head == null || list2.head == null) return null;
        if (list1.tail != list2.tail) {
            return null;
        }
        Node shorter = new Node();
        Node longer = new Node();
        if (list1.size > list2.size) {
            longer = list1.head;
            shorter = list2.head;
        } else {
            longer = list2.head;
            shorter = list1.head;
        }

        longer = getKthNode(longer, Math.abs(list1.size-list2.size));
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;

    }

    // Add same node
    void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;

    }


}
