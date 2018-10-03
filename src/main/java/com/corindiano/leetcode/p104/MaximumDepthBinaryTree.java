package com.corindiano.leetcode.p104;

import com.corindiano.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class MaximumDepthBinaryTree {
    static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);

        while (!queue.isEmpty()) {
            TreeNode elem = queue.poll();

            if (elem == null) {
                depth++;
                if (queue.peek() != null) queue.offer(null);
            } else {
                if (elem.left != null) queue.offer(elem.left);
                if (elem.right != null) queue.offer(elem.right);
            }
        }

        return depth;
    }
}