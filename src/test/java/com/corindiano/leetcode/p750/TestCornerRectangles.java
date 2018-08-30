package com.corindiano.leetcode.p750;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCornerRectangles {
    @Test
    public void testCase1() {
        int[][] grid = {
            {1, 0, 0, 1, 0},
            {0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0},
            {1, 0, 1, 0, 1}
        };

        assertEquals(1, new CornerRectangles().countCornerRectangles(grid));
    }

    @Test
    public void testCase2() {
        int[][] grid = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };

        assertEquals(9, new CornerRectangles().countCornerRectangles(grid));
    }

    @Test
    public void testCase3() {
        int[][] grid = {
            {1, 1, 1}
        };

        assertEquals(0, new CornerRectangles().countCornerRectangles(grid));
    }

    @Test
    public void testCase4() {
        int[][] grid = {
            {1, 0, 1},
            {1, 1, 1}
        };

        assertEquals(1, new CornerRectangles().countCornerRectangles(grid));
    }
}