package com.corindiano.leetcode.p347;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestTopKFrequentElements {
    @Test
    void testCase1() {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        List<Integer> actual = TopKFrequentElements.topKFrequent(nums, 2);
        assertEquals(2, actual.size());
        assertTrue(actual.contains(1));
        assertTrue(actual.contains(2));
    }

    @Test
    void testCase2() {
        int[] nums = { 3, 1, 2, 1, 2, 1, 3, 3, 5 };
        List<Integer> actual = TopKFrequentElements.topKFrequent(nums, 2);
        assertEquals(2, actual.size());
        assertTrue(actual.contains(1));
        assertTrue(actual.contains(3));
    }
}