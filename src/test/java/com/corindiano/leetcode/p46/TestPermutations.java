package com.corindiano.leetcode.p46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestPermutations {
    @Test
    void testCase1() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<Integer>() {{ add(1); add(2); add(3); }});
        expected.add(new ArrayList<Integer>() {{ add(1); add(3); add(2); }});
        expected.add(new ArrayList<Integer>() {{ add(2); add(1); add(3); }});
        expected.add(new ArrayList<Integer>() {{ add(2); add(3); add(1); }});
        expected.add(new ArrayList<Integer>() {{ add(3); add(1); add(2); }});
        expected.add(new ArrayList<Integer>() {{ add(3); add(2); add(1); }});
        List<List<Integer>> actual = Permutations.permute(new int[] {1, 2, 3});
        assertEquals(expected.size(), actual.size());

        for (List<Integer> l : actual) {
            if (!expected.contains(l)) fail();
        }
    }
}