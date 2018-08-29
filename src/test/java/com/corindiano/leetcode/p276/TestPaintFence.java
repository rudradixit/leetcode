package com.corindiano.leetcode.p276;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestPaintFence {
    @Test
    void testCase1() {
        assertEquals(6, PaintFence.numWays(3, 2));
    }

    @Test
    void testCase2() {
        assertEquals(10, PaintFence.numWays(4, 2));
    }
}