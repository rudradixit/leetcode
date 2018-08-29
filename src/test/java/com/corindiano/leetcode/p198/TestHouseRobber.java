package com.corindiano.leetcode.p198;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestHouseRobber {
    @Test
    void testCase1() {
        int[] nums = new int[]{1, 2, 3, 1};
        assertEquals(4, HouseRobber.rob(nums));
    }

    @Test
    void testCase2() {
        int[] nums = new int[]{2, 7, 9, 3, 1};
        assertEquals(12, HouseRobber.rob(nums));
    }

    @Test
    void testCase3() {
        int[] nums = new int[]{5, 4, 3, 9, 1};
        assertEquals(14, HouseRobber.rob(nums));
    }
}