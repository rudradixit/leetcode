package com.corindiano.leetcode.p226;

import com.corindiano.leetcode.common.TreeNode;

class InvertBinaryTree {
    static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = new TreeNode(root.val);
        temp.left = invertTree(root.right);
        temp.right = invertTree(root.left);
        return temp;
    }
}