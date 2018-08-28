package com.corindiano.leetcode.p256;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestPaintHouse {
    @Test
    void testDefault() {
        int[][] costs = new int[][]{ {17, 2, 17}, {16, 16, 5}, {14, 3, 19}};
        assertEquals(10, PaintHouse.minCost(costs));
    }

    @Test
    void testCase1() {
        int[][] costs = new int[][]{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(13, PaintHouse.minCost(costs));
    }

    @Test
    void testCase2() {
        int[][] costs = new int[][]{ {5, 8, 6}, {19, 14, 13}, {7, 5, 12}, {14, 15, 17}, {3, 20, 10}};
        assertEquals(43, PaintHouse.minCost(costs));
    }
}