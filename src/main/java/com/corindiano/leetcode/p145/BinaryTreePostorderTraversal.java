package com.corindiano.leetcode.p145;

import com.corindiano.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Given a binary tree, return the postorder traversal of its nodes' values.
 *
 * Example:
 *
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * Output: [3,2,1]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
class BinaryTreePostorderTraversal {
    static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Deque<TreeNode> stack = new ArrayDeque<>();
        Deque<TreeNode> end = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode n = stack.poll();
            end.push(n);

            if (n.left != null) stack.push(n.left);
            if (n.right != null) stack.push(n.right);
        }

        List<Integer> results = new ArrayList<>(end.size());
        TreeNode n;

        while ((n = end.poll()) != null) {
            results.add(n.val);
        }

        return results;
    }
}