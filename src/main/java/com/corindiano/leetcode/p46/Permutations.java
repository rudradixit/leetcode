package com.corindiano.leetcode.p46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Permutations {
    private static void _permute(int[] nums, int idx, Integer[] partial, boolean[] available, List<List<Integer>> results) {
        if (idx == nums.length) {
            results.add(new ArrayList<>(Arrays.asList(partial)));
            return;
        }

        for (int i=0; i<nums.length; i++) {
            if (available[i]) {
                partial[idx] = nums[i];
                available[i] = false;
                _permute(nums, idx + 1, partial, available, results);
                available[i] = true;
            }
        }
    }

    static List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) return Collections.emptyList();

        boolean[] available = new boolean[nums.length];
        for (int i=0; i<available.length; i++) available[i] = true;
        List<List<Integer>> results = new ArrayList<>();
        _permute(nums, 0, new Integer[nums.length], available, results);
        return results;
    }
}