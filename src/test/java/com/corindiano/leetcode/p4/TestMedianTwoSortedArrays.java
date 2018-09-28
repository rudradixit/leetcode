package com.corindiano.leetcode.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMedianTwoSortedArrays {
    @Test
    void testCase1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        assertEquals(2D, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void testCase2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        assertEquals(2.5D, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }
}