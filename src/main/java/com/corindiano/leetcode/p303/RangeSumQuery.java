package com.corindiano.leetcode.p303;

/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 *
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 *
 * Note:
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 */
class RangeSumQuery {
    int[] sums;

    RangeSumQuery(int[] nums) {
        int[] sums = new int[nums.length];
        int prev = 0;

        for (int i=0; i<nums.length; i++) {
            sums[i] = prev + nums[i];
            prev = sums[i];
        }

        this.sums = sums;
    }

    int sumRange(int i, int j) {
        int first = (i - 1 < 0) ? 0 : sums[i-1];
        return this.sums[j] - first;
    }
}