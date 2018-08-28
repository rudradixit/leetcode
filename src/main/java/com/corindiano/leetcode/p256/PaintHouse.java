package com.corindiano.leetcode.p256;

/**
 * There are a row of n houses, each house can be painted with one of the three colors:
 * red, blue or green. The cost of painting each house with a certain color is different.
 * You have to paint all the houses such that no two adjacent houses have the same color.
 *
 * The cost of painting each house with a certain color is represented by a n x 3 cost matrix.
 * For example, costs[0][0] is the cost of painting house 0 with color red; costs[1][2] is the
 * cost of painting house 1 with color green, and so on...
 * Find the minimum cost to paint all houses.
 *
 * Note:
 * All costs are positive integers.
 *
 * Example:
 *
 * Input: [[17,2,17],[16,16,5],[14,3,19]]
 * Output: 10
 * Explanation: Paint house 0 into blue, paint house 1 into green, paint house 2 into blue.
 *              Minimum cost: 2 + 5 + 3 = 10.
 */
class PaintHouse {
    static int minCost(int[][] costs) {
        int r = costs[0][0];
        int b = costs[0][1];
        int g = costs[0][2];

        for (int i=1; i<costs.length; i++) {
            int newR = Math.min(b, g) + costs[i][0];
            int newB = Math.min(r, g) + costs[i][1];
            int newG = Math.min(r, b) + costs[i][2];
            r = newR;
            b = newB;
            g = newG;
        }

        return Math.min(r, Math.min(b, g));
    }
}