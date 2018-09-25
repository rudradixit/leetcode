package com.corindiano.leetcode.random;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestSumInSet {
    @Test
    void testCase1() {
        Set<Set<Integer>> expected = new HashSet<>();
        expected.add(new HashSet<Integer>() {{ add(6); add(7); }});
        expected.add(new HashSet<Integer>() {{ add(2); add(5); add(6); }});
        expected.add(new HashSet<Integer>() {{ add(1); add(5); add(7); }});
        expected.add(new HashSet<Integer>() {{ add(1); add(3); add(9); }});
        expected.add(new HashSet<Integer>() {{ add(1); add(2); add(3); add(7); }});
        Set<Integer> input = new HashSet<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(5);
        input.add(6);
        input.add(7);
        input.add(9);
        Set<Set<Integer>> actual = SumInSet.sum(input, 13);
        assertEquals(expected.size(), actual.size());

        for (Set<Integer> l : actual) {
            if (!expected.contains(l)) fail();
        }
    }
}