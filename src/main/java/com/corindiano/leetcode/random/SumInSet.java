package com.corindiano.leetcode.random;

import java.util.*;

class SumInSet {
    private static void _sum(Set<Integer> nums, int target, Set<Integer> partial, boolean[] used, Set<Set<Integer>> results) {
        if (target == 0) {
            results.add(new HashSet<>(partial));
            return;
        }


        int i=0;

        for (Integer v : nums) {
            if (!used[i] && (target - v >= 0)) {
                partial.add(v);
                used[i] = true;
                _sum(nums, target - v, partial, used, results);
                partial.remove(v);
                used[i] = false;
            }

            i++;
        }
    }

    static Set<Set<Integer>> sum(Set<Integer> nums, int target) {
        if (nums == null || nums.isEmpty()) return Collections.emptySet();

        Set<Set<Integer>> results = new HashSet<>();
        boolean[] used = new boolean[nums.size()];
        _sum(nums, target, new HashSet<>(), used, results);

        return results;
    }
}