package datastructure.linkedlistinterviewquiz;

public class Main {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.createLinkedList(1);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(3);
        ll.insertNode(5000);
        ll.insertNode(10);
        ll.insertNode(20);
        ll.traversalLinkedList();

        // Deleting duplicates.
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.deleteDups(ll);
        ll.traversalLinkedList();

        // Implement an algorithm to find the nth to the last element.
        ReturnNthToLast returnNthToLast = new ReturnNthToLast();
        Node n = returnNthToLast.nthToLast(ll, 2);
        System.out.println("The nth Value to the last: " + n.value + "\n");

        // Implement partitioning elements.
        PartitionALL parts = new PartitionALL();
        LinkedList t = parts.partition(ll,10);
        ll.traversalLinkedList();


        // Implement Sum of LinkedList elements.
        LinkedList llA = new LinkedList();
        llA.insertNode(7);
        llA.insertNode(1);
        llA.insertNode(6);
        llA.insertNode(10);
        LinkedList llB = new LinkedList();
        llB.insertNode(5);
        llB.insertNode(9);
        llB.insertNode(2);
        SumTwoLists sumLL = new SumTwoLists();
        LinkedList resultSum = sumLL.sumLists(llA, llB);
        System.out.println("The sum of two Linked List in reverse:");
        resultSum.traversalLinkedList();

        // Implementing Linked List Intersection between two lists.
        IntersectionLL interLL = new IntersectionLL();
        interLL.addSameNode(llA, llB, 7);
        interLL.addSameNode(llA, llB, 2);
        interLL.addSameNode(llA, llB, 1);

        Node inter = interLL.findIntersection(llA, llB);
        System.out.print("The intersecting node: " + inter.value);
  


    }
}
