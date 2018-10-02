package com.corindiano.leetcode.p200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestNumberOfIslands {
    @Test
    void testCase1() {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'1', '1', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        assertEquals(2, NumberOfIslands.numIslands(grid));
    }

    @Test
    void testCase2() {
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };

        assertEquals(1, NumberOfIslands.numIslands(grid));
    }

    @Test
    void testCase3() {
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '1', '1', '0'},
            {'1', '1', '1', '1', '1'},
            {'0', '0', '0', '0', '1'}
        };

        assertEquals(1, NumberOfIslands.numIslands(grid));
    }

    @Test
    void testCase4() {
        char[][] grid = {
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '0', '1'},
            {'1', '0', '0', '0', '1'},
            {'1', '1', '1', '1', '1'}
        };

        assertEquals(1, NumberOfIslands.numIslands(grid));
    }
}