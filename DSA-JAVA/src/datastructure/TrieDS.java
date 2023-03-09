package datastructure;

import java.util.HashMap;
import java.util.Map;

public class TrieDS {

    private Node root;

    public TrieDS(){
        root = new Node();
    }

    // Creating a node.
    public static class Node {
        Map<Character, Node> children;
        boolean endOfString;

        public Node() {
            children = new HashMap<>();
            endOfString = false;
            System.out.println("The Trie has been created");
        }
    }

    // Insert in Trie
    public void insert(String word) {
        Node current = root;
        for (int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            Node node = current.children.get(ch);
            if (node == null) {
                node = new Node();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println("Successfully inserted " + word+ " in Trie");
    }

    // Main class
    public static void main(String[] args){

        TrieDS newTrie = new TrieDS();



    }
}
