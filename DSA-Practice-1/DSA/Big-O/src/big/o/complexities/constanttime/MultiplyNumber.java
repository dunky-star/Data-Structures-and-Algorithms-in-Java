package big.o.complexities.constanttime;

// Constant time complexities
public class MultiplyNumber{
    private static int multiplyNumbers (int n){
        return n * n;
    }

    public static void main(String[] args) {
        System.out.println("Result of multiplying 3 by 3: " +multiplyNumbers(3));
        System.out.println("Result of multiply 4 by 4: " +multiplyNumbers(4));
    }
}