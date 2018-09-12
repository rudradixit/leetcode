package com.corindiano.leetcode.p590;

import com.corindiano.leetcode.common.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Given an n-ary tree, return the postorder traversal of its nodes' values.
 * 	        1
 * 	    /   |   \
 * 	   3    2    4
 * 	  / \
 * 	 5   6
 *
 * For example, given a 3-ary tree:
 * Return its postorder traversal as: [5,6,3,2,4,1].
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
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