package datastructure.arraysinterviewquiz;

import java.util.Scanner;

/**
 * Calculate average temperature/ Find the number of days above average temperature.
 */
public class ArrayProject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days' temperature? ");
        int numOfDays = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= numOfDays; i++){
            System.out.println("Day " + i + " 's high temp: ");
            int next = sc.nextInt();
            sum += next;
        }
        double average = (double) sum / numOfDays;
        System.out.println();
        System.out.println("Average temp: " + average);
    }
}
