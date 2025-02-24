package arraylist.datastructure;
/*
Write a function which prints to the console the pairs from a given array
- Find the time complexity for the created method.
 */
public class FnPrintPairInArray {

    private static void printPair(int[] arr){
        for (int i : arr) {
            for (int j : arr) {
                System.out.println(i + "," + j);
            }
        }
    }


    public static void main(String[] args) {
      int[] intArray = {1, 2, 3, 4, 5};
      printPair(intArray);
    }

}
