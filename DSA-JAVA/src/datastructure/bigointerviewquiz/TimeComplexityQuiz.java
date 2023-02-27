package datastructure.bigointerviewquiz;

/**
 * What is the time complexity for these given methods?
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

    // The time complexity for this method is also Big O(a * b).
    public static void printUnorderedPairsJj(int[] arrayA, int[] arrayB) {
        for (int k : arrayA) {   // --------> O(a)
            for (int i : arrayB) {  // --------> O(b)
                for (k = 0; k < 1000000; k++) {  // // --------> O(1)
                    System.out.println(k + ", " + i);
                }
            }
        }
    }


}
