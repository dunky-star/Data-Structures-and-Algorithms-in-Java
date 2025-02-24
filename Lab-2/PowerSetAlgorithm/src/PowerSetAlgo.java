import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.util.Set;

public class PowerSetAlgo {

    private static List<Set<Integer>> powerSet(List<Integer> X) {
        List<Set<Integer>> P = new ArrayList<>();
        Set<Integer> S = new HashSet<>(); // S is the empty set
        P.add(S); // P is now the set { S }

        while (!X.isEmpty()) {
            Integer f = X.remove(0); // Remove the first element from X
            List<Set<Integer>> newSubsets = new ArrayList<>();

            for (Set<Integer> x : P) {
                Set<Integer> T = new HashSet<>(x); // Create a new set T
                T.add(f); // T is the set containing f and all elements of x
                newSubsets.add(T); // Add T to the new subsets list
            }

            P.addAll(newSubsets); // Add all new subsets to P
        }

        return P;
    }
    public static void main(String[] args) {

        List<Integer> X = new ArrayList<>();
        X.add(100);
        X.add(225);
        X.add(30);

        List<Set<Integer>> powerSet = powerSet(X);
        System.out.println("Power Set: " + powerSet);
    }
}