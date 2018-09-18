package com.corindiano.leetcode.random.heaps;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestComputeUnionOfSortedSequences {
    @Test
    void testCase1() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<Integer>() {{ add(3); add(5); add(7); }});
        input.add(new ArrayList<Integer>() {{ add(0); add(6); }});
        input.add(new ArrayList<Integer>() {{ add(0); add(6); add(28); }});

        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(0);
        expected.add(3);
        expected.add(5);
        expected.add(6);
        expected.add(6);
        expected.add(7);
        expected.add(28);

        assertEquals(expected, ComputeUnionOfSortedSequences.mergeSortedArrays(input));
    }
}