package datastructure.linkedlistinterviewquiz;

public class LinkedList {
    protected Node head;
    protected Node tail;
    protected int size;

    // Create Linked List
    protected void createLinkedList(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    // Insert node into LinkedList
    protected void insertNode(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // Traversal and output of Linked List nodes.
    protected void traversalLinkedList(){
        Node tempNode = head;
        for (int i = 0; i < size; i++){
            System.out.println(tempNode.value);
            if(i != size - 1 ){
                System.out.println(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

}
