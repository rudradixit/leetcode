package com.corindiano.leetcode.p102;

import com.corindiano.leetcode.common.TreeNode;

import java.util.*;

class BinaryTreeLevelOrderTraversal {
    static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> levelResults = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode top = queue.poll();

            if (top == null) {
                results.add(levelResults);
                levelResults = new ArrayList<>();

                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                levelResults.add(top.val);
                if (top.left != null) queue.add(top.left);
                if (top.right != null) queue.add(top.right);
            }
        }

        return results;
    }
}