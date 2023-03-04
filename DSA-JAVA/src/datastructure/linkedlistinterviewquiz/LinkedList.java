package datastructure.linkedlistinterviewquiz;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Create Linked List
    public void createLinkedList(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    // Insert node into LinkedList
    public void insertNode(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // Traversal and output of Linked List nodes.
    public void traversalLinkedList(){
        Node tempNode = head;
        for (int i = 0; i < size; i++){
            System.out.println(tempNode.value);
        }

    }

}
