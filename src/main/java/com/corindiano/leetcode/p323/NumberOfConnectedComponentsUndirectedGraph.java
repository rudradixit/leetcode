package com.corindiano.leetcode.p323;

import java.util.*;

class NumberOfConnectedComponentsUndirectedGraph {
    static int countComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        int ans = 0;

        for (int[] edge : edges) {
            graph.putIfAbsent(edge[0], new HashSet<>());
            graph.get(edge[0]).add(edge[1]);

            graph.putIfAbsent(edge[1], new HashSet<>());
            graph.get(edge[1]).add(edge[0]);
        }

        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                ans++;
                stack.push(i);

                while (!stack.isEmpty()) {
                    int current = stack.pop();
                    visited[current] = true;

                    if (graph.containsKey(current)) {
                        for (int neighbor : graph.get(current)) {
                            if (!visited[neighbor]) stack.push(neighbor);
                        }
                    }
                }
            }
        }

        return ans;
    }
}