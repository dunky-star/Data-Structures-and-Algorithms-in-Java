package datastructure.bigointerviewquiz;

/**
 * Write a function which prints to the console the pairs from given array.
 * Find the time complexity for the created method.
 */
public class PrintArrayPair {

    public static void main(String[] args){
        int[] sampleArray = {5, 4, 10, 8, 11, 68, 87, 200, -1};
        // Function call.
        printArrPairs(sampleArray);
    }

    // The time complexity for this method is Big O(n^2).
    public static void printArrPairs(int[] sampleArray){
        for (int i : sampleArray) {
            for (int j : sampleArray) {
                System.out.println(i + ", " + j);
            }
        }
    }
}
