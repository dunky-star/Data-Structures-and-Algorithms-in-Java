package hashtable.datastructure;
import java.util.HashMap;
import java.util.Map;

public class CheckArrayDuplicate {
    private static Boolean containsDuplicate(int[] nums){
        if (nums.length == 0){
            return false;
        }
        HashMap<Integer, Integer> numCounts = new HashMap<Integer, Integer>();

        for (int i : nums){
            numCounts.put(i, numCounts.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: numCounts.entrySet()){
            if(entry.getValue() > 1){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 5, 7, 8, 9, 10};
        System.out.println("The arrays contain duplicate items: " +containsDuplicate(arr1));
    }
}
