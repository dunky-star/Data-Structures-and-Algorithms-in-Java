package datastructure.algorithms.dividenconquer;

/**
 * Problem statement:
 * Given N number of houses along the street with some amount of money.
 * Adjacent houses cannot be stolen.
 * Find the maximum amount that can be stolen.
 *
 */

public class HouseRobber {

    private int maxMoneyRecursive(int[] HouseNetWorth, int currentIndex) {
        if (currentIndex >= HouseNetWorth.length) {
            return 0;
        }

        int stealCurrentHouse = HouseNetWorth[currentIndex] + maxMoneyRecursive(HouseNetWorth, currentIndex+2);
        int skipCurrentHouse = maxMoneyRecursive(HouseNetWorth, currentIndex+1);

        return Math.max(stealCurrentHouse,skipCurrentHouse );
    }

    public int maxMoney(int[] HouseNetWorth) {
        return maxMoneyRecursive(HouseNetWorth, 0);
    }

    public static void main(String[] args){
        HouseRobber hr = new HouseRobber();
            int[] houseNetWorth = {6, 7, 1, 8, 30, 8, 2, 4};
            System.out.println("Max net worth stolen: " +hr.maxMoney(houseNetWorth) + "USD");
    }
}
