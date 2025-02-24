package com.dunky.arrays;

import java.util.Objects;

public class MultiDimensional {

    private static void printMM(int[][] matrix){

        if(matrix == null || matrix.length == 0){
            Objects.requireNonNull(matrix);
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {

        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        printMM(matrix1);

    }
}
