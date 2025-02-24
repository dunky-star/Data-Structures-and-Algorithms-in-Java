package arraylist.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIntro {

    public static void main(String[] args) {
        // Declaring an ArrayList
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("Dunky", "John", "Doe"));
        // INSERTION (Inserting an element to ArrayList)
        stringList.add("Geoffrey");
        stringList.add("Duncan");
        stringList.add("Opiyo");
        // Inserting and element at index 3
        stringList.add(3, "Omega");
        // Checking the size of ArrayList after declaration
        System.out.println("\nThe size of the ArrayList: " +stringList.size());

        // ACCESS BY INDEX
        System.out.println("An element at index 3 is: " +stringList.get(5));

        // Printing all ArrayList elements:
        //System.out.println("ArrayList elements: " +stringList);

        /*
         ARRAYLIST TRAVERSAL
         */

        // Using traditional "FOR" loop
        System.out.println("\nUSING TRADITIONAL FOR LOOP");
        for(int i = 0; i < stringList.size(); i++){
            String word = stringList.get(i);
            if(word.startsWith("G") || word.contains("c")){
                System.out.println(word);
            }
        }

        // Using "FOR-EACH" loop
        System.out.println("\nUSING FOR-EACH LOOP");

        for(String wordy: stringList ){
            if(wordy.startsWith("G") || wordy.contains("c")){
                System.out.println(wordy);
            }
        }

        // Using "ITERATOR" to Loop
        System.out.println("\nUSING ITERATOR TO LOOP");
        Iterator<String> itr = stringList.iterator();
        while(itr.hasNext()){
            String wordyIterator = itr.next();
            if(wordyIterator.startsWith("G") || wordyIterator.contains("c")){
                System.out.println(wordyIterator);
            }
        }

        /*
         ARRAYLIST SEARCH
         */
        System.out.println("\nSEARCHING THROUGH AN ARRAYLIST");
        for( String wordSearch : stringList){
           if(wordSearch.equalsIgnoreCase("Geoffrey")){
               System.out.println("The element is found");
               break;
           }
        }

        // INDEX OF
        System.out.println("\nindexOf IN AN ARRAYLIST");
        int index = stringList.indexOf("Geoffrey");
        System.out.println("The Element is found at index: " + index);

        // REMOVE ELEMENT
        System.out.println("\nREMOVE ELEMENTS IN AN ARRAYLIST");
        stringList.remove(4);
        stringList.remove("Doe");
        System.out.println("Array stringList after removing some elements: " +stringList);
    }
}
