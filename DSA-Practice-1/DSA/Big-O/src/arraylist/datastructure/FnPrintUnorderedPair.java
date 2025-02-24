package arraylist.datastructure;
/*
What is the time complexity of this printUnorderedPair method?
 */
public class FnPrintUnorderedPair {
    private static void printUnorderedPair(int[] arr){
        for (int i= 0; i< arr.length;  i++) {
            for (int j = i + 1; j<arr.length; j++) {
                System.out.println(arr[i] + "," + arr[j]);
            }
        }
    }


    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        printUnorderedPair(intArray);
    }

}

