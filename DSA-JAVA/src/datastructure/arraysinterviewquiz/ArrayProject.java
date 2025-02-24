package datastructure.arraysinterviewquiz;

import java.util.Scanner;

/**
 * Calculate average temperature and find the number of days above average temperature.
 */

public class ArrayProject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days' temperature? ");
        int numOfDays = sc.nextInt();
        int[] temps = new int[numOfDays];
        // Record temperature and find average
        int sum = 0;
        for (int i = 0; i < numOfDays; i++){
            System.out.println("Day " + (i+1) + " 's high temp: ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
        double average = (double) sum / numOfDays;
        System.out.println();
        // Count days above average.
        int above = 0;
        for (int i = 0; i < temps.length; i++){
            if (temps[i]>average){
                above++;
            }
        }
        System.out.println("Average temp: " + average);
        System.out.println(above + " Days above average");

    }
}
