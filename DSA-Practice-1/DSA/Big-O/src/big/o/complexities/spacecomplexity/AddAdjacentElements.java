package big.o.complexities.spacecomplexity;

// Function to add adjacent elements between 0 and n
// There will be roughly O(n) calls to pair sum. However, those calls do not exist
// simultaneously, so you only need O(1) space.
public class AddAdjacentElements {
    private static int pairSum(int a, int b){
        return a + b;
    }
    private static int pairSumSequence(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum += pairSum(i, i+1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum pair: " + pairSumSequence(100));
    }
}
