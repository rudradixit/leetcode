package com.corindiano.leetcode.p746;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMinCostClimbingStairs {
    @Test
    void testCase1_Slow() {
        int[] costs = new int[]{10, 15, 20};
        assertEquals(15, MinCostClimbingStairs.minCostClimbingStairs_Slow(costs));
    }

    @Test
    void testCase2_Slow() {
        int[] costs = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, MinCostClimbingStairs.minCostClimbingStairs_Slow(costs));
    }

    @Test
    void testCase3_Slow() {
        int size = 40;
        int[] costs = new int[size];

        for (int i=0; i<size; i++) {
            costs[i] = (i % 2 == 0) ? 1 : size;
        }

        assertEquals(costs.length / 2, MinCostClimbingStairs.minCostClimbingStairs_Slow(costs));
    }

    @Test
    void testCase1() {
        int[] costs = new int[]{10, 15, 20};
        assertEquals(15, MinCostClimbingStairs.minCostClimbingStairs(costs));
    }

    @Test
    void testCase2() {
        int[] costs = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, MinCostClimbingStairs.minCostClimbingStairs(costs));
    }

    @Test
    void testCase3() {
        int size = 400;
        int[] costs = new int[size];

        for (int i=0; i<size; i++) {
            costs[i] = (i % 2 == 0) ? 1 : size;
        }

        assertEquals(costs.length / 2, MinCostClimbingStairs.minCostClimbingStairs(costs));
    }
}