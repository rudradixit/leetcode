package com.corindiano.leetcode.p547;

import java.util.ArrayDeque;
import java.util.Deque;

class FriendCircles {
    static int findCircleNum(int[][] M) {
        boolean[] visited = new boolean[M.length];
        int count = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int friend=0; friend<M.length; friend++) {
            if (!visited[friend]) {
                count++;
                stack.push(friend);

                while (!stack.isEmpty()) {
                    int top = stack.pop();
                    visited[top] = true;
                    int[] row = M[top];

                    for (int r=0; r<M.length; r++) {
                        if (row[r] == 1 && !visited[r]) {
                            stack.push(r);
                        }
                    }
                }
            }
        }

        return count;
    }
}