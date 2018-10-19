package com.corindiano.leetcode.random;

import com.corindiano.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

class TreeTraversals {
    private final static String SUFFIX = ", ";

    private static void _preorder(TreeNode root, StringBuilder sb) {
        if (root == null) return;

        sb.append(root.val).append(SUFFIX);
        _preorder(root.left, sb);
        _preorder(root.right, sb);
    }

    static String preorderR(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        _preorder(root, sb);
        return sb.substring(0, sb.length() - SUFFIX.length());
    }

    static String preorderI(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> stack = new ArrayDeque<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            sb.append(node.val).append(SUFFIX);

            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }

        return sb.substring(0, sb.length() - SUFFIX.length());
    }

    private static void _inorder(TreeNode root, StringBuilder sb) {
        if (root == null) return;

        _inorder(root.left, sb);
        sb.append(root.val).append(SUFFIX);
        _inorder(root.right, sb);
    }

    static String inorderR(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        _inorder(root, sb);
        return sb.substring(0, sb.length() - SUFFIX.length());
    }

    static String inorderI(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            while (root.left != null) {
                stack.push(root.left);
                root = root.left;
            }

            TreeNode node = stack.pop();
            sb.append(node.val).append(SUFFIX);
            if (node.right != null) {
                root = node.right;
                stack.push(root);
            }
        }

        return sb.substring(0, sb.length() - SUFFIX.length());
    }

    private static void _postorder(TreeNode root, StringBuilder sb) {
        if (root == null) return;

        _postorder(root.left, sb);
        _postorder(root.right, sb);
        sb.append(root.val).append(SUFFIX);
    }

    static String postorderR(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        _postorder(root, sb);
        return sb.substring(0, sb.length() - SUFFIX.length());
    }

    static String postorderI(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> stack1 = new ArrayDeque<>();
        Deque<TreeNode> stack2 = new ArrayDeque<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode top = stack1.pop();
            stack2.push(top);

            if (top.left != null) stack1.push(top.left);
            if (top.right != null) stack1.push(top.right);
        }

        while (!stack2.isEmpty()) {
            sb.append(stack2.pop().val).append(SUFFIX);
        }

        return sb.substring(0, sb.length() - SUFFIX.length());
    }

    public static void main(String[] args) {
        TreeNode leftleftrightleftright = new TreeNode(3);
        TreeNode leftleftrightleft = new TreeNode(2);
        leftleftrightleft.right = leftleftrightleftright;
        TreeNode leftleftright = new TreeNode(4);
        leftleftright.left = leftleftrightleft;
        TreeNode leftleft = new TreeNode(1);
        leftleft.right = leftleftright;
        TreeNode left = new TreeNode(5);
        left.left = leftleft;
        TreeNode rightleftleft = new TreeNode(7);
        TreeNode rightleft = new TreeNode(8);
        rightleft.left = rightleftleft;
        TreeNode rightrightright = new TreeNode(12);
        TreeNode rightrightleft = new TreeNode(10);
        TreeNode rightright = new TreeNode(11);
        rightright.right = rightrightright;
        rightright.left = rightrightleft;
        TreeNode right = new TreeNode(9);
        right.left = rightleft;
        right.right = rightright;
        TreeNode root = new TreeNode(6);
        root.left = left;
        root.right = right;

        System.out.println("\n\nPreorder (recursive): " + preorderR(root));
        System.out.println("Preorder (iterative): " + preorderI(root));
        System.out.println("\n\nInorder (recursive): " + inorderR(root));
        System.out.println("Inorder (iterative): " + inorderI(root));
        System.out.println("\n\nPostorder (recursive): " + postorderR(root));
        System.out.println("Postorder (iterative): " + postorderI(root));
    }
}