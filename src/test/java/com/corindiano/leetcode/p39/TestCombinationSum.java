package com.corindiano.leetcode.p39;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestCombinationSum {
    @Test
    void testCase1() {
        int[] candidates = new int[] {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<Integer>() {{ add(2); add(2); add(3); }});
        expected.add(new ArrayList<Integer>() {{ add(7); }});
        List<List<Integer>> results = CombinationSum.combinationSum(candidates, target);
        assertEquals(expected.size(), results.size());

        for (int i=0; i<expected.size(); i++) {
            if (!expected.get(i).equals(results.get(i))) fail();
        }
    }
}