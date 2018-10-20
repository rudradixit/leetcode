package com.corindiano.leetcode.p547;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFriendCircles {
    @Test
    void testCase1() {
        int[][] M = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };
        assertEquals(2, FriendCircles.findCircleNum(M));
    }

    @Test
    void testCase2() {
        int[][] M = {
            {1, 1, 0},
            {1, 1, 1},
            {0, 1, 1}
        };
        assertEquals(1, FriendCircles.findCircleNum(M));
    }
}