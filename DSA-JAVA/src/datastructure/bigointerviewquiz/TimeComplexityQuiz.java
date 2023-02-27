package datastructure.bigointerviewquiz;

/**
 * What is the time complexity for this given method?
 */
public class TimeComplexityQuiz {
    public static void main(String[] args){
        int[] sampleArray = {1, 2, 3, 4, 5};
        printUnorderedPairs(sampleArray);
    }

    public static void printUnorderedPairs(int[] arr){
        for (int i : arr) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(i + ", " + arr[j]);
            }
        }
    }
}
