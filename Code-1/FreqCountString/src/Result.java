import java.io.*;
import java.util.*;

class Result {
    public static final int MOD = 1000000007;

    public static int countGoodSubsequences(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        long result = 0;

        for (int count = 1; count <= word.length(); count++) {
            long subseqCount = 1;
            for (int f : freq) {
                if (f >= count) {
                    subseqCount = (subseqCount * (binomial(f, count) + 1)) % MOD;
                }
            }
            result = (result + subseqCount - 1) % MOD;
        }

        return (int) result;
    }

    private static long binomial(int n, int k) {
        long res = 1;
        for (int i = 0; i < k; i++) {
            res = res * (n - i) / (i + 1);
        }
        return res % MOD;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int result = countGoodSubsequences(word);
        System.out.println(result);
    }
}
