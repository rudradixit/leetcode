package com.corindiano.leetcode.p215;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestKthLargestElementInArray {
    @Test
    void testCase1() {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        assertEquals(5, KthLargestElementInArray.findKthLargest(nums, 2));
    }

    @Test
    void testCase2() {
        int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        assertEquals(4, KthLargestElementInArray.findKthLargest(nums, 4));
    }
}