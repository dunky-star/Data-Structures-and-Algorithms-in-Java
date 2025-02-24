package big.o.complexities.spacecomplexity;

// Stack space in recursive calls count too.
// Code like this would take O(n) time and O(n) space.
public class SumRecursive {
    private static int sum(int n){
        if(n <= 0){
            return 0;
        }

        return n + sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(10));
    }
}
