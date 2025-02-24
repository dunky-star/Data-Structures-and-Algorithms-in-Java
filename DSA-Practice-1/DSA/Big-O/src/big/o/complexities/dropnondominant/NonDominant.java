package big.o.complexities.dropnondominant;


public class NonDominant {
    private static void printNumbers (int n){
        for(int i = 0; i < n; i++){   //----------------------------> O(n)
            for(int j = i; j < n; j++){ //----------------------------> O(n)
                System.out.println( i + "  " +j);
            }

        }

        for(int k = 0; k < n; k++){ //----------------------------> O(n)
            System.out.println( k);
        }
    }

    public static void main(String[] args) {
        // O(n^2) + O(n) = O(n^2 + n) = O(n^2) => Drop non-dominant term
        printNumbers(5);
    }
}
