package arraylist.datastructure;
/*
Create a function which calculate the sum and product of elements in an array.
- Find the time complexity for the created method.
 */
public class FnSumProductArrayList {

    private static void fnSumProuctOfElements(int[] arr){
        int sum = 0;
        int product = 1;
        for (int j : arr) {
            sum += j;
        }
        for (int i : arr) {
            product *= i;
        }

        System.out.println("The sum is: " + sum + " and the product is: " +product);
    }

    public static void main(String[] args) {
      int[] intArray = {10, 20, 1, 2, 4, 30};
        fnSumProuctOfElements(intArray);
    }

}
