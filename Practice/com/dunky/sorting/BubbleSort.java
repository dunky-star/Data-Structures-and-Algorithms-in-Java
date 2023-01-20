package com.dunky.sorting;

public class BubbleSort {
    public void sort(int[] numbers){
        for (int i = 1; i < numbers.length; i++){
            for (int j = 1; j < numbers.length - i; j++){
                if(numbers[j] <  numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public void sortImprovement1(int[] numbers){
        for (int i = 1; i < numbers.length; i++){
            for (int j = 1; j < numbers.length - i; j++){
                if (numbers[j] > numbers[j + 1]){
                    swap(numbers, j, j + 1);
                }
            }
        }
    }

    public void swap (int[] numbers, int j, int k){
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }

    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = new int[] {2, 7, 5, 2, 4, 6, 2, 8, 1, 0};
        int[] numbers2 = new int[] {100, 7, 1000, 2, 4, 6, 2, 8, 1, 4000, 0};

        System.out.println("First number array Before Bubble Sort");
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        bubbleSort.sort(numbers);
        System.out.println("\nFirst number array after Bubble Sort");
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }


        System.out.println("\nSecond number array Before Bubble Sort");
        for(int i=0; i < numbers2.length; i++){
            System.out.print(numbers2[i] + " ");
        }

        bubbleSort.sortImprovement1(numbers2);
        System.out.println("\nSecond number array after Bubble Sort");
        for(int i=0; i < numbers2.length; i++){
            System.out.print(numbers2[i] + " ");
        }

    }

// End of BubbleSort class.
}
