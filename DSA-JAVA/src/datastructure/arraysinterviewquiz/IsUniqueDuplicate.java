package datastructure.arraysinterviewquiz;

/**
 * Write a program to check if an array is unique or not.
 *
 *         Example
 *
 *         int[] intArray = {1,2,3,4,5,6};
 *         isUnique(intArray) // true
 */
public class IsUniqueDuplicate {
    public static void main(String[] args){
        int[] intArray = {1, 2, 3, 4, 5, 10, 20, 0};
        boolean result = isUnique(intArray);
        System.out.println("Array is Unique: " + result );

    }

    // Is unique
    public static boolean isUnique(int[] intArray){
        for(int i = 0; i < intArray.length; i++){
            for(int j= i+1; j < intArray.length; j++){
                if(intArray[i] ==  intArray[j]){
                    return false;
                }
            }
        }
        return true;
    }

}
