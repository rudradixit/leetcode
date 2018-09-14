package com.corindiano.leetcode.p96;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestUniqueBinarySearchTrees {
    @Test
    void testCase1() {
        assertEquals(1, UniqueBinarySearchTrees.numTrees(1));
    }

    @Test
    void testCase2() {
        assertEquals(2, UniqueBinarySearchTrees.numTrees(2));
    }

    @Test
    void testCase3() {
        assertEquals(5, UniqueBinarySearchTrees.numTrees(3));
    }

    @Test
    void testCase4() {
        assertEquals(14, UniqueBinarySearchTrees.numTrees(4));
    }
}