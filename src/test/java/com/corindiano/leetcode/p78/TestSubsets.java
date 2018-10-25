package com.corindiano.leetcode.p78;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestSubsets {
    @Test
    void testCase1() {
        int[] input = new int[] {1, 2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(new ArrayList<Integer>() {{ add(1); }});
        expected.add(new ArrayList<Integer>() {{ add(2); }});
        expected.add(new ArrayList<Integer>() {{ add(1); add(2); }});
        List<List<Integer>> results = Subsets.subsets(input);
        assertEquals(expected.size(), results.size());

        for (List<Integer> r : results) {
            if (!expected.contains(r)) fail();
        }
    }

    @Test
    void testCase2() {
        int[] input = new int[] {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(new ArrayList<Integer>() {{ add(1); }});
        expected.add(new ArrayList<Integer>() {{ add(2); }});
        expected.add(new ArrayList<Integer>() {{ add(3); }});
        expected.add(new ArrayList<Integer>() {{ add(1); add(2); }});
        expected.add(new ArrayList<Integer>() {{ add(1); add(3); }});
        expected.add(new ArrayList<Integer>() {{ add(2); add(3); }});
        expected.add(new ArrayList<Integer>() {{ add(1); add(2); add(3); }});
        List<List<Integer>> results = Subsets.subsets(input);
        assertEquals(expected.size(), results.size());

        for (List<Integer> r : results) {
            if (!expected.contains(r)) fail();
        }
    }

    @Test
    void testCase3() {
        int[] input = new int[] {1, 2, 3, 4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(new ArrayList<Integer>() {{ add(1); }});
        expected.add(new ArrayList<Integer>() {{ add(2); }});
        expected.add(new ArrayList<Integer>() {{ add(3); }});
        expected.add(new ArrayList<Integer>() {{ add(4); }});
        expected.add(new ArrayList<Integer>() {{ add(1); add(2); }});
        expected.add(new ArrayList<Integer>() {{ add(1); add(3); }});
        expected.add(new ArrayList<Integer>() {{ add(1); add(4); }});
        expected.add(new ArrayList<Integer>() {{ add(2); add(3); }});
        expected.add(new ArrayList<Integer>() {{ add(2); add(4); }});
        expected.add(new ArrayList<Integer>() {{ add(3); add(4); }});
        expected.add(new ArrayList<Integer>() {{ add(1); add(2); add(3); }});
        expected.add(new ArrayList<Integer>() {{ add(1); add(2); add(4); }});
        expected.add(new ArrayList<Integer>() {{ add(1); add(3); add(4); }});
        expected.add(new ArrayList<Integer>() {{ add(2); add(3); add(4); }});
        expected.add(new ArrayList<Integer>() {{ add(1); add(2); add(3); add(4); }});
        List<List<Integer>> results = Subsets.subsets(input);
        assertEquals(expected.size(), results.size());

        for (List<Integer> r : results) {
            if (!expected.contains(r)) fail();
        }
    }
}