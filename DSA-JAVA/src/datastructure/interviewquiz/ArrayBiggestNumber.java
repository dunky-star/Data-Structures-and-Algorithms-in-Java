package datastructure.interviewquiz;

public class ArrayBiggestNumber {

    public static void main(String[] args){
        int[] sampleArray = {5, 4, 10, 8, 11, 68, 87, 200, -1};
        // Function call.
        findingBiggestNumber(sampleArray);
    }

    public static void findingBiggestNumber(int[] sampleArray){
        int biggestNumber = sampleArray[0];
        for(int i = 0; i < sampleArray.length; i++){
            if(sampleArray[i] > biggestNumber){
                biggestNumber = sampleArray[i];
            }
        }
        System.out.println("The biggest number is: " + biggestNumber);
    }
}
