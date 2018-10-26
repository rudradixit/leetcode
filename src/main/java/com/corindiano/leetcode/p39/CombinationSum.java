package com.corindiano.leetcode.p39;

import java.util.ArrayList;
import java.util.List;

class CombinationSum {
    private static void backtrack(int[] candidates, int target, int i, List<Integer> sol, int sum, List<List<Integer>> results) {
        if (i == candidates.length) return;
        if (sum > target) return;

        if (sum == target) {
            results.add(new ArrayList<>(sol));
            return;
        }

        sum += candidates[i];
        sol.add(candidates[i]);
        backtrack(candidates, target, i, sol, sum, results);

        sum -= candidates[i];
        sol.remove(sol.size()-1);
        backtrack(candidates, target, i+1, sol, sum, results);
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), 0, results);
        return results;
    }
}