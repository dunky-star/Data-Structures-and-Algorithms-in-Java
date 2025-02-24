package arraylist.datastructure;
/*
What is the time complexity of the printUnorderedPair function below?
 */

public class FnRuntimeArrayAArrayB2 {
    private static void printUnorderedPair(int[] arrayA, int[] arrayB){
        for (int i : arrayA) {    // --------------------------------------->O(a)
            for (int j : arrayB) { // -------------------------------------->O(b)
                for(int k = 0; k < 1000000; k++){  // -----------------------> O(1)
                    if (i > j) {  // -------------------------------------------->O(1)
                        System.out.println(i + "," + j);
                    }
                }
            }
        }  // Overall => O(ab) complexity
    }


    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3, 4, 5, 10};
        int[] intArray2 = {1, 20, 3, 4, 50, 100};
        printUnorderedPair(intArray1, intArray2);
    }

}
