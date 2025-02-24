package array.datastructure;

/*
* Finding a Number in an Array:
Write a program to check if an array contains a number in Java.

int[] intArray = {1,2,3,4,5,6};
searchInArray(intArray, 6); // 5
*
*/
public class FindANumberInArray {
    private static void searchInArray(int[] intArray, int valueToSearch) {
        if (intArray.length == 0){
            System.out.println("The array is empty");
            return;
        }

        for (int i = 0; i < intArray.length; i++){
            if(intArray[i] == valueToSearch){
                System.out.println("Value is found at index of " +i);
                return;
            }
        }
        System.out.println("Value not found!");
    }

    public static void main(String[] args) {
        int[] intArray = {};
        searchInArray(intArray, 7); // 5
    }

}

