package com.corindiano.leetcode.p70;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways
 * can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
class ClimbingStairs {
    static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int p1 = 2;
        int p2 = 1;
        int aux = p1 + p2;

        for (int i=4; i<=n; i++) {
            p2 = p1;
            p1 = aux;
            aux = p1 + p2;
        }

        return aux;
    }
}