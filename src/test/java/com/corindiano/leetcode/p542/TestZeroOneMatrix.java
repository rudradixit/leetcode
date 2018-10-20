package com.corindiano.leetcode.p542;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestZeroOneMatrix {
    @Test
    void testCase1() {
        int[][] input = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        int[][] expected = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        assertArrayEquals(expected, ZeroOneMatrix.updateMatrix(input));
    }

    @Test
    void testCase2() {
        int[][] input = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 1, 1}
        };

        int[][] expected = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 2, 1}
        };

        assertArrayEquals(expected, ZeroOneMatrix.updateMatrix(input));
    }

    @Test
    void testCase3() {
        int[][] input = {
            {1, 1, 1},
            {0, 1, 0},
            {0, 0, 0}
        };

        int[][] expected = {
            {1, 2, 1},
            {0, 1, 0},
            {0, 0, 0}
        };

        assertArrayEquals(expected, ZeroOneMatrix.updateMatrix(input));
    }
}