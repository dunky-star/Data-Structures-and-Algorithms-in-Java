package com.dunky.sorting;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] numbers){
        for (int i = 1; i < numbers.length ; i++){
            for (int j = 1; j < numbers.length - i; j++){
                if(numbers[j] >  numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public void sortImprovement(int[] numbersArray){
        for (int i = 1; i < numbersArray.length; i++){
            for (int j = 1; j < numbersArray.length - i; j++){
                if (numbersArray[j] > numbersArray[j + 1]){
                    swap(numbersArray, j, j + 1);
                }
            }
        }
    }

    public void swap (int[] numbersArray, int j, int k){
        int temp = numbersArray[j];
        numbersArray[j] = numbersArray[k];
        numbersArray[k] = temp;
    }

    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = new int[] {2, 7, 5, 2, 4, 6, 2, 8, 1, 0};
        int[] numbers2 = new int[] {100, 7, 1000, 2, 4, 6, 2, 8, 1, 4000, 0};

        System.out.println("First number array Before Bubble Sort");
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        bubbleSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println();

        System.out.println("Second number array Before Bubble Sort");
        for(int i=0; i < numbers2.length; i++){
            System.out.print(numbers2[i] + " ");
        }

        System.out.println();
        bubbleSort.sortImprovement(numbers2);
        System.out.println(Arrays.toString(numbers2));

    }

// End of BubbleSort class.
}
