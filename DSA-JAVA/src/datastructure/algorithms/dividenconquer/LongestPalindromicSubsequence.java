package datastructure.algorithms.dividenconquer;

/**
 * Problem statement:
 * S is a given string.
 * Find the longest palindromic subsequence (LPS).
 * -  Subsequence - is a sequence that can be derived from another sequence
 * by deleting some elements without changing the order of them.
 * - Palindrome is a string that reads the same backward as well as forward.
 */

public class LongestPalindromicSubsequence {
    private int findLPSLength(String st, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return 0;
        }
        if (startIndex == endIndex) {
            return 1;
        }

        int count1 = 0;
        if (st.charAt(startIndex) == st.charAt(endIndex)) {
            count1 = 2 + findLPSLength(st, startIndex+1, endIndex-1);
        }
        int count2 = findLPSLength(st, startIndex+1, endIndex);
        int count3 = findLPSLength(st, startIndex, endIndex-1);

        return Math.max(count1, Math.max(count2, count3));
    }

    public int findLPSLength(String st) {
        return findLPSLength(st, 0, st.length()-1);
    }

    // Main method
    public static void main(String[] args){
        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
        System.out.println("Longest Palindromic Sequence: " +lps.findLPSLength("elrmenmet"));
    }
}
