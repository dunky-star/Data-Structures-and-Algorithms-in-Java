package big.o.complexities.dropconstant;

// Linear time complexities
public class DropConstant {
    private static void printNumbers (int n){
        for(int i = 0; i < n; i++){   //----------------------------> O(n)
            System.out.println("Number at " + i + " is " +i);
        }

        for(int j = 0; j < n; j++){ //----------------------------> O(n)
            System.out.println("Number at " + j + " is " +j);
        }
    }

    public static void main(String[] args) {
        // n + n = 2n => O(2n) = O(n) => Drop constant
        printNumbers(10);
    }
}
