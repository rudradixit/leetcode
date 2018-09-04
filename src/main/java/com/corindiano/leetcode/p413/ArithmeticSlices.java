package com.corindiano.leetcode.p413;

/**
 * A sequence of number is called arithmetic if it consists of at least three
 * elements and if the difference between any two consecutive elements is the same.
 *
 * For example, these are arithmetic sequence:
 *
 * 1, 3, 5, 7, 9
 * 7, 7, 7, 7
 * 3, -1, -5, -9
 * The following sequence is not arithmetic.
 *
 * 1, 1, 2, 5, 7
 *
 * A zero-indexed array A consisting of N numbers is given. A slice of that array is
 * any pair of integers (P, Q) such that 0 <= P < Q < N.
 *
 * A slice (P, Q) of array A is called arithmetic if the sequence:
 * A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.
 *
 * The function should return the number of arithmetic slices in the array A.
 *
 *
 * Example:
 *
 * A = [1, 2, 3, 4]
 *
 * return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.
 */
class ArithmeticSlices {
    // Brute force, naive solution
    static int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3) return 0;

        int n = A.length;
        int diff;
        int slices = 0;

        for (int i=0; i<n-2; i++) {
            diff = A[i + 1] - A[i];
            int mult = 2;
            int size = 2;
            for (int j=i+2; j<n; j++) {
                if (A[j] - A[i] == (mult * diff)) {
                    size++;
                    mult++;
                } else break;
            }

            if (size >= 3) slices = slices + (size - 2);
        }

        return slices;
    }

    // DP solution with n-space requirement
    static int numberOfArithmeticSlicesWithDP1(int[] A) {
        if (A == null || A.length < 3) return 0;

        int n = A.length;
        int[] dp = new int[n];
        int sum = 0;

        for (int i=2; i<A.length; i++) {
            int d1 = A[i] - A[i-1];
            int d2 = A[i-1] - A[i-2];

            if (d1 == d2) {
                dp[i] = 1 + dp[i - 1];
                sum += dp[i];
            }
        }

        return sum;
    }

    // DP solution with constant space
    static int numberOfArithmeticSlicesWithDP2(int[] A) {
        return -1;
    }
}