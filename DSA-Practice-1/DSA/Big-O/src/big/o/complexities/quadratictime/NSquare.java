package big.o.complexities.quadratictime;

public class NSquare {
    private static void printNumbers (int n){
        for(int i = 0; i < n; i++){   //----------------------------> O(n)
            for(int j = i; j < n; j++){ //----------------------------> O(n)
            System.out.println( i + "  " +j);
        }

        }
    }

    public static void main(String[] args) {
        // n * n = n^2 => O(n^2) => Quadratic
        printNumbers(5);
    }
}
