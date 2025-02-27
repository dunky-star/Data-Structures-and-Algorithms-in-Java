package datastructure.algorithms.dividenconquer;

/**
 * Problem statement:
 * S1 and S2 are given strings.
 * Convert S2 to S1 using delete, insert or replace operations.
 * Find the minimum counts of edit operation.
 *
 * Example:
 * S1 = "table"
 * S2 = "tbres"
 * Output = 3
 * Explanation: Insert "a" to second position, rplace "r" with "i" and delete "s"
 */

public class ConvertOneStringToAnother {
    private int findMinOperations (String s1, String s2, int i1, int i2) {
        if (i1 == s1.length()) {
            return s2.length() - i2;
        }
        if (i2 == s2.length()) {
            return s1.length() - i1;
        }

        if (s1.charAt(i1)==s2.charAt(i2)) {
            return findMinOperations(s1, s2, i1+1, i2+1);
        }
        int deleteOp = 1 + findMinOperations(s1, s2, i1+1, i2);
        int insertOp = 1 + findMinOperations(s1, s2, i1, i2+1);
        int replaceOp = 1 + findMinOperations(s1, s2, i1+1, i2+1);
        return Math.min(deleteOp, Math.min(insertOp, replaceOp));
    }

    public int findMinOperations(String s1, String s2) {
        return findMinOperations(s1, s2, 0, 0);
    }


    public static void main(String[] args){


    }
}
