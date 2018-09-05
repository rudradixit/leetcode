package com.corindiano.leetcode.p760;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TestFindAnagramMappings {
    @Test
    void testCase1() {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};
        int[] results = {1, 4, 3, 2, 0};
        assertArrayEquals(results, FindAnagramMappings.anagramMappings(A, B));
    }
}