package com.corindiano.leetcode.p542;

import java.util.ArrayDeque;
import java.util.Queue;

class ZeroOneMatrix {
    static int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> queue = new ArrayDeque<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++) {
                if (matrix[i][j] == 0) queue.add(new int[]{i, j});
                else matrix[i][j] = Integer.MAX_VALUE;
            }

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1},
        };

        while (!queue.isEmpty()) {
            int[] top = queue.remove();

            for (int[] direction : directions) {
                int i = top[0] + direction[0];
                int j = top[1] + direction[1];

                if (i < 0 || i >= m || j < 0 || j >= n || matrix[i][j] <= matrix[top[0]][top[1]] + 1) continue;

                queue.add(new int[] {i, j});
                matrix[i][j] = matrix[top[0]][top[1]] + 1;
            }
        }

        return matrix;
    }
}