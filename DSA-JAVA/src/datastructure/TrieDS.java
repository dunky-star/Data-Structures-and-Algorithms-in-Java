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

    // Search for a word in Trie

    public boolean search(String word) {
        Node currentNode = root;
        for (int i =0; i<word.length(); i++) {
            char ch = word.charAt(i);
            Node node = currentNode.children.get(ch);
            if (node == null) {
                System.out.println("Word: "+word+ " does not exist in Trie");
                return false;
            }
            currentNode = node;
        }
        if (currentNode.endOfString == true) {
            System.out.println("Word: "+word+ " exists in Trie");
            return true;
        } else {
            System.out.println("Word: "+word+ " does not exist in Trie. But it is a prefix of another string");
        }
        return currentNode.endOfString;
    }

    // Delete a String from Trie

    private boolean delete(Node parentNode, String word, int index) {
        char ch = word.charAt(index);
        Node currentNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;

        if (currentNode.children.size() > 1) {
            delete(currentNode, word, index+1);
            return false;
        }
        if (index == word.length() -1) {
            if (currentNode.children.size()>=1) {
                currentNode.endOfString = false;
                return false;
            } else {
                parentNode.children.remove(ch);
                return true;
            }
        }
        if (currentNode.endOfString == true) {
            delete(currentNode, word, index+1);
            return false;
        }
        canThisNodeBeDeleted = delete(currentNode, word, index+1);
        if (canThisNodeBeDeleted == true) {
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

    public void delete(String word) {
        if (search(word) == true) {
            delete(root, word, 0);
        }
    }

    // Main class
    public static void main(String[] args){

        TrieDS newTrie = new TrieDS();
        newTrie.insert("API");
        newTrie.insert("APIS");
        newTrie.insert("APPLE");
        newTrie.search("API");
        newTrie.search("APS");

    }
}
