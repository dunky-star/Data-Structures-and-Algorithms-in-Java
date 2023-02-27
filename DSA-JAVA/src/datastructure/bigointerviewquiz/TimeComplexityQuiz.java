package datastructure.bigointerviewquiz;

/**
 * What is the time complexity for this given method?
 */
public class TimeComplexityQuiz {
    public static void main(String[] args){
        int[] sampleArray = {1, 2, 3, 4, 5};
        printUnorderedPairs(sampleArray);
    }

    // The time complexity for this method is Big O(n^2).
    public static void printUnorderedPairs(int[] arr){
        for (int i : arr) {   // --------> O(n-1)
            for (int j = i + 1; j < arr.length; j++) {  // --------> O(n-2)
                System.out.println(i + ", " + arr[j]);
            }
        }
    }
}
