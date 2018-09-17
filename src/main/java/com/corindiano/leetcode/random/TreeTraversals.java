package com.corindiano.leetcode.random;

import com.corindiano.leetcode.common.TreeNode;

class TreeTraversals {
    private final static String SUFFIX = ", ";

    private static void _preorder(TreeNode root, StringBuilder sb) {
        if (root == null) return;

        sb.append(root.val).append(SUFFIX);
        _preorder(root.left, sb);
        _preorder(root.right, sb);
    }

    static String preorder(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        _preorder(root, sb);
        return sb.substring(0, sb.length() - SUFFIX.length());
    }

    private static void _inorder(TreeNode root, StringBuilder sb) {
        if (root == null) return;

        _inorder(root.left, sb);
        sb.append(root.val).append(SUFFIX);
        _inorder(root.right, sb);
    }

    static String inorder(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        _inorder(root, sb);
        return sb.substring(0, sb.length() - SUFFIX.length());
    }

    public static void main(String[] args) {
        TreeNode leftleftrightleftright = new TreeNode(11);
        TreeNode leftleftrightleft = new TreeNode(10);
        leftleftrightleft.right = leftleftrightleftright;
        TreeNode leftleftright = new TreeNode(12);
        leftleftright.left = leftleftrightleft;
        TreeNode leftleft = new TreeNode(3);
        leftleft.right = leftleftright;
        TreeNode left = new TreeNode(2);
        left.left = leftleft;
        TreeNode rightleftleft = new TreeNode(9);
        TreeNode rightleft = new TreeNode(4);
        rightleft.left = rightleftleft;
        TreeNode rightrightright = new TreeNode(7);
        TreeNode rightrightleft = new TreeNode(6);
        TreeNode rightright = new TreeNode(5);
        rightright.right = rightrightright;
        rightright.left = rightrightleft;
        TreeNode right = new TreeNode(13);
        right.left = rightleft;
        right.right = rightright;
        TreeNode root = new TreeNode(1);
        root.left = left;
        root.right = right;

        System.out.println("Preorder: " + preorder(root));
        System.out.println("Inorder: " + inorder(root));
    }
}