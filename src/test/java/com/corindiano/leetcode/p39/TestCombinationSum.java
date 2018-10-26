package com.corindiano.leetcode.p39;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TestCombinationSum {
    @Test
    void testCase1() {
        int[] candidates = new int[] {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> results = CombinationSum.combinationSum(candidates, target);
        assertNotNull(results);
    }

    @Test
    void testCase2() {
        int[] candidates = new int[] {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
        int target = 88;
        List<List<Integer>> results = CombinationSum.combinationSum(candidates, target);
        assertNotNull(results);
    }
}