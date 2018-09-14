package com.corindiano.leetcode.p96;

class UniqueBinarySearchTrees {
    static int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i=2; i<=n; i++) {
            int sum = 0;

            for (int j=0; j<i; j++) {
                int right = i-j-1;

                if (j == 0) {
                    sum += dp[i-1];
                } else if (right == 0) {
                    sum += dp[i-1];
                } else {
                    sum += dp[j] * dp[right];
                }
            }

            dp[i] = sum;
        }

        return dp[n];
    }
}