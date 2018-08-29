package com.corindiano.leetcode.p53;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMaximumSubarray {
    @Test
    public void testCase1() {
        int[] nums = new int[] {1};
        assertEquals(1, MaximumSubarray.maxSubArray(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = new int[] {1, 2, 3};
        assertEquals(6, MaximumSubarray.maxSubArray(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = new int[] {3, 2, 1};
        assertEquals(6, MaximumSubarray.maxSubArray(nums));
    }

    @Test
    public void testCase4() {
        int[] nums = new int[] {3, 2, 1, -9, 1, 2, 1};
        assertEquals(6, MaximumSubarray.maxSubArray(nums));
    }

    @Test
    public void testCase5() {
        int[] nums = new int[] {1, 2, 1, -9, 3, 2, 3};
        assertEquals(8, MaximumSubarray.maxSubArray(nums));
    }

    @Test
    public void testCase6() {
        int[] nums = new int[] {-2, 1, -3, 4};
        assertEquals(4, MaximumSubarray.maxSubArray(nums));
    }

    @Test
    public void testCase7() {
        int[] nums = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, MaximumSubarray.maxSubArray(nums));
    }
}