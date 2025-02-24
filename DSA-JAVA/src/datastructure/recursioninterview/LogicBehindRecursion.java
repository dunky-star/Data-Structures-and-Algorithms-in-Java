package datastructure.recursioninterview;

public class LogicBehindRecursion {

    public static void main(String[] args){

        // Calling the methods - case 1.
        firstMethod();

        // Calling the methods - case 2.
        recursiveMethod(30);



    }

    // case 1:
    public static void firstMethod(){
        secondMethod();
        System.out.println("I am the first method");
    }
    private static void secondMethod() {
        thirdMethod();
        System.out.println("I am the second method");
    }

    private static void thirdMethod() {
        fourthMethod();
        System.out.println("I am the third method");
    }

    private static void fourthMethod() {

        System.out.println("I am the fourth method");
    }

    // case 2:
    public static void recursiveMethod(int n){
        if (n < 1){
            System.out.println(n + " is less than 1");
        } else {
            recursiveMethod(n - 1);
            System.out.println(n);
        }
    }

    // Case 3: n to the power 2


}
