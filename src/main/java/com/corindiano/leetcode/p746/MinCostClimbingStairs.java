package com.corindiano.leetcode.p746;

/**
 * On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
 *
 * Once you pay the cost, you can either climb one or two steps. You need to find minimum
 * cost to reach the top of the floor, and you can either start from the step with index 0,
 * or the step with index 1.
 *
 * Example 1:
 * Input: cost = [10, 15, 20]
 * Output: 15
 * Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
 *
 * Example 2:
 * Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 * Output: 6
 * Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
 *
 * Note:
 * cost will have a length in the range [2, 1000].
 * Every cost[i] will be an integer in the range [0, 999].
 */
class MinCostClimbingStairs {
    // Works, but recursive and slow
    private static int minCostClimbingStairs_Slow(int[] costs, int i, int acc) {
        if (i >= costs.length) return acc;

        int current = acc + costs[i];
        int costA = minCostClimbingStairs_Slow(costs, i+1, current);
        int costB = minCostClimbingStairs_Slow(costs, i+2, current);

        return Math.min(costA, costB);
    }

    static int minCostClimbingStairs_Slow(int[] costs) {
        return Math.min(
            minCostClimbingStairs_Slow(costs, 0, 0),
            minCostClimbingStairs_Slow(costs, 1, 0)
        );
    }

    static int minCostClimbingStairs(int[] costs) {
        if (costs.length == 2) {
            return Math.min(costs[0], costs[1]);
        }

        int[] stairsWithPrices = new int[costs.length];

        for (int i=0; i<costs.length; i++) {
            int p2 = (i-2) < 0 ? 0 : stairsWithPrices[i-2];
            int p1 = (i-1) < 0 ? 0 : stairsWithPrices[i-1];
            stairsWithPrices[i] = costs[i] + Math.min(p1, p2);
        }

        return Math.min(
            stairsWithPrices[costs.length - 2],
            stairsWithPrices[costs.length - 1]
        );
    }
}