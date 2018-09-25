package com.corindiano.leetcode.random.graphs;

import com.corindiano.leetcode.common.Node;

import java.util.*;

class GraphTraversals {
    static Integer[] dfs(Node node) {
        List<Integer> visited = new ArrayList<>();
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            Node n = stack.pop();
            visited.add(n.val);

            for (Node c : n.children) {
                stack.push(c);
            }
        }

        return visited.toArray(new Integer[0]);
    }

    static Integer[] bfs(Node node) {
        List<Integer> visited = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node n = queue.poll();
            visited.add(n.val);

            for (Node c : n.children) {
                queue.offer(c);
            }
        }

        return visited.toArray(new Integer[0]);
    }
}