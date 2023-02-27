package datastructure.bigointerviewquiz;

/**
 * What is the time complexity for this given method?
 */
public class TimeComplexityQuiz {
    public static void main(String[] args){
      
    }

    // The time complexity for this method is Big O(n^2).
    public static void printUnorderedPairs(int[] arr){
        for (int i : arr) {   // --------> O(n)
            for (int j = i + 1; j < arr.length; j++) {  // --------> O(n/2)
                System.out.println(i + ", " + arr[j]);
            }
        }
    }

    // The time complexity for this method is Big O(a * b).
    public static void printUnorderedPairsJ(int[] arrayA, int[] arrayB) {
        for (int k : arrayA) {   // --------> O(a)
            for (int i : arrayB) {  // --------> O(b)
                if (k < i) {
                    System.out.println(k + ", " + i);
                }
            }
        }
    }


}
