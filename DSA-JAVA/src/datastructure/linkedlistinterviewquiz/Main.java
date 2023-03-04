package datastructure.linkedlistinterviewquiz;

public class Main {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.createLinkedList(1);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(3);
        ll.insertNode(5000);
        ll.traversalLinkedList();

        // Deleting duplicates.
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.deleteDups(ll);
        ll.traversalLinkedList();

        // Implement an algorithm to find the nth to the last element.
        ReturnNthToLast returnNthToLast = new ReturnNthToLast();
        Node n = returnNthToLast.nthToLast(ll, 2);
        System.out.println(n.value);
    }
}
