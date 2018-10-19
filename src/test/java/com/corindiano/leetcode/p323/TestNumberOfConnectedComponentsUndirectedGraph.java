package com.corindiano.leetcode.p323;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestNumberOfConnectedComponentsUndirectedGraph {
    @Test
    void testCase1() {
        int n = 5;
        int[][] edges = {
            {0, 1},
            {1, 2},
            {3, 4},
        };
        assertEquals(2, NumberOfConnectedComponentsUndirectedGraph.countComponents(n, edges));
    }

    @Test
    void testCase2() {
        int n = 5;
        int[][] edges = {
            {0, 1},
            {1, 2},
            {2, 3},
            {3, 4},
        };
        assertEquals(1, NumberOfConnectedComponentsUndirectedGraph.countComponents(n, edges));
    }

    @Test
    void testCase3() {
        int n = 4;
        int[][] edges = {
            {1, 2},
            {0, 1},
            {0, 2}
        };
        assertEquals(2, NumberOfConnectedComponentsUndirectedGraph.countComponents(n, edges));
    }
}