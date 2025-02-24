import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean subsetSum(int[] S, int k){
        int n = S.length;

        // Generate all subsets using a bit mask approach
        for (int i = 0; i < (1 << n); i++) {
            //List<Integer> subset = new ArrayList<>();
            int sum = 0;
            for(int j = 0; j < n; j++){
                // Check if the j-th bit in the i-th subset is set
                if((i & (1 << j)) != 0){
                    //subset.add(S[j]);
                    sum += S[j];
                }

            }
            // Check if the sum of the current subset is equal to k
            if(sum == k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] S = {3, 34, 4, 12, 5, 2};
        int k = 9;

        boolean result = subsetSum(S, k);

        if (result) {
            System.out.println("Subset with sum " + k + " found: " + result);
        } else {
            System.out.println("No subset with sum " + k + " found.");
        }
    }
}