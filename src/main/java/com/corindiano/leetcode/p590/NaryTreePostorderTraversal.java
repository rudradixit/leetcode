package com.corindiano.leetcode.p590;

import com.corindiano.leetcode.common.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class NaryTreePostorderTraversal {
    static List<Integer> postorder(Node root) {
        if (root == null) return null;

        Deque<Node> stack = new ArrayDeque<>();
        Deque<Node> end = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node n = stack.pop();
            end.push(n);

            List<Node> children = n.children;

            if (children != null && !children.isEmpty()) {
                for (Node c : children) stack.push(c);
            }
        }

        List<Integer> results = new ArrayList<>(end.size());
        Node n;
        while ((n = end.poll()) != null) {
            results.add(n.val);
        }

        return results;
    }
}