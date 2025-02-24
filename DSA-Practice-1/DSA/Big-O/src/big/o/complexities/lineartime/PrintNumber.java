package big.o.complexities.lineartime;

// Linear time complexities
public class PrintNumber {
    private static void printNumbers (int n){
        for(int i = 0; i < n; i++){
            System.out.println("Number at " + i + " is " +i);
        }
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}
