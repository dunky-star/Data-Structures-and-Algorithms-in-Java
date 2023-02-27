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

    public static void printArrPairs(int[] sampleArray){
        for (int i = 0; i < sampleArray.length; i++){
            for (int j = 0; j < sampleArray.length; j++){
                System.out.println(sampleArray[i] + ", " + sampleArray[j]);
            }
        }
    }
}
