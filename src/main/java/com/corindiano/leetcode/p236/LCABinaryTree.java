package com.corindiano.leetcode.p236;

import com.corindiano.leetcode.common.TreeNode;

class LCABinaryTree {
    static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root.equals(p) || root.equals(q)) return root;

        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);

        if (left != null && right != null) return root;
        if (left != null) return left;
        return right;
    }
}