package com.corindiano.leetcode.p78;

import java.util.ArrayList;
import java.util.List;

class Subsets {
    static void backtrack(int[] nums, int start, List<Integer> sol, List<List<Integer>> results) {
        if (start == nums.length) {
            results.add(new ArrayList<>(sol));
            return;
        }

        for (int k=0; k<2; k++) {
            if (k == 1) sol.add(nums[start]);
            backtrack(nums, start + 1, sol, results);
            if (k == 1) sol.remove(sol.size()-1);
        }
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        backtrack(nums, 0, sol, results);
        return results;
    }
}