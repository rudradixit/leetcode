package com.corindiano.leetcode.random;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestNQueens {
    @Test
    public void testCase1() {
        Integer[][] solution1 = {
            {0, 1, 0, 0},
            {0, 0, 0, 1},
            {1, 0, 0, 0},
            {0, 0, 1, 0}
        };

        Integer[][] solution2 = {
            {0, 0, 1, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 1},
            {0, 1, 0, 0}
        };

        List<Integer[][]> results = new NQueens().solveFor(4, 4);
        assertEquals(2, results.size());
        Integer[][] actualSolution1 = results.get(0);
        Integer[][] actualSolution2 = results.get(1);
        assertArrayEquals(solution1, actualSolution1);
        assertArrayEquals(solution2, actualSolution2);
    }
}