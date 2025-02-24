package datastructure.linkedlistinterviewquiz;

/**
 * You have two numbers represented by a linked list, where each node contains a single
 * digit. The digits are stored in reverse order, such that the 1's digit is at the head
 * of the list. Write a function that adds the two numbers and returns the sum as a linked
 * list.
 *
 * list1 = 7 -> 1 -> 6
 * list2 =  5 -> 9 -> 2
 * result = 2 -> 1 -> 9
 */

public class SumTwoLists {

    // LinkedList - Sum Lists
    LinkedList sumLists(LinkedList llA, LinkedList llB) {
        Node n1 = llA.head;
        Node n2 = llB.head;
        int carry = 0;
        LinkedList resultLL = new LinkedList();
        while (n1 != null || n2 != null) {
            int result = carry;
            if (n1 != null) {
                result += n1.value;
                n1 = n1.next;
            }
            if (n2 != null) {
                result += n2.value;
                n2 = n2.next;
            }
            resultLL.insertNode(result%10);
            carry = result / 10;
        }
        return resultLL;
    }

}
