package com.corindiano.leetcode.p70;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestClimbingStairs {
    @Test
    void testCase1() {
        assertEquals(2, ClimbingStairs.climbStairs(2));
    }

    @Test
    void testCase2() {
        assertEquals(3, ClimbingStairs.climbStairs(3));
    }
}