package com.dunky.multithreading;

public class SingleThreaded {

    public static void main(String[] args) {

        printI();
        System.out.println("\n");
        printJ();

    }
    private static void printI(){
        for(int i = 1; i <= 200; i++){
            System.out.print("i: " + i + "\t");
        }
    }

    private static void printJ(){
        for(int j = 1; j <= 200; j++){
            System.out.print("j: " + j + "\t");
        }
    }
}
