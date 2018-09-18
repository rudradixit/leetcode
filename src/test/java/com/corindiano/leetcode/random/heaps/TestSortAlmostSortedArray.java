package com.corindiano.leetcode.random.heaps;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSortAlmostSortedArray {
    @Test
    void testCase1() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(2);
        input.add(1);
        input.add(5);
        input.add(4);
        assertEquals(expected, SortAlmostSortedArray.sort(2, input.iterator()));
    }
}