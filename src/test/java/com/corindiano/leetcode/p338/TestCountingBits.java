package com.corindiano.leetcode.p338;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TestCountingBits {
    @Test
    public void testCase1() {
        assertArrayEquals(new int[]{0, 1, 1, 2}, CountingBits.countBits(3));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, CountingBits.countBits(5));
    }
}