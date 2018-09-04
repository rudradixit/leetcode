package com.corindiano.leetcode.p413;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestArithmeticSlices {
    @Test
    void testCase1() {
        assertEquals(0, ArithmeticSlices.numberOfArithmeticSlices(null));
        assertEquals(0, ArithmeticSlices.numberOfArithmeticSlicesWithDP1(null));
    }

    @Test
    void testCase2() {
        int[] nums = {1};
        assertEquals(0, ArithmeticSlices.numberOfArithmeticSlices(nums));
        assertEquals(0, ArithmeticSlices.numberOfArithmeticSlicesWithDP1(nums));
    }

    @Test
    void testCase3() {
        int[] nums = {1, 2};
        assertEquals(0, ArithmeticSlices.numberOfArithmeticSlices(nums));
        assertEquals(0, ArithmeticSlices.numberOfArithmeticSlicesWithDP1(nums));
    }

    @Test
    void testCase4() {
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(6, ArithmeticSlices.numberOfArithmeticSlices(nums));
        assertEquals(6, ArithmeticSlices.numberOfArithmeticSlicesWithDP1(nums));
    }

    @Test
    void testCase5() {
        int[] nums = {7, 7, 7, 7};
        assertEquals(3, ArithmeticSlices.numberOfArithmeticSlices(nums));
        assertEquals(3, ArithmeticSlices.numberOfArithmeticSlicesWithDP1(nums));
    }

    @Test
    void testCase6() {
        int[] nums = {3, -1, -5, -9};
        assertEquals(3, ArithmeticSlices.numberOfArithmeticSlices(nums));
        assertEquals(3, ArithmeticSlices.numberOfArithmeticSlicesWithDP1(nums));
    }

    @Test
    void testCase7() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(3, ArithmeticSlices.numberOfArithmeticSlices(nums));
        assertEquals(3, ArithmeticSlices.numberOfArithmeticSlicesWithDP1(nums));
    }

    @Test
    void testCase8() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(6, ArithmeticSlices.numberOfArithmeticSlices(nums));
        assertEquals(6, ArithmeticSlices.numberOfArithmeticSlicesWithDP1(nums));
    }
}