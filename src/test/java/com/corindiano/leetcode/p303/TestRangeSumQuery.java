package com.corindiano.leetcode.p303;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestRangeSumQuery {
    @Test
    void testCase1() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery rsq = new RangeSumQuery(nums);
        assertEquals(1, rsq.sumRange(0, 2));
        assertEquals(-1, rsq.sumRange(2, 5));
        assertEquals(-3, rsq.sumRange(0, 5));
    }
}