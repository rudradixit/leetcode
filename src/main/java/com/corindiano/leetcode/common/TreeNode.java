package com.corindiano.leetcode.common;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof TreeNode)) return false;

        TreeNode other = (TreeNode) obj;

        if (this.val != other.val) return false;
        if (this.left == null && other.left != null) return false;
        if (this.left != null && other.left == null) return false;
        if (this.left != null && !this.left.equals(other.left)) return false;
        if (this.right == null && other.right != null) return false;
        if (this.right != null && other.right == null) return false;
        if (this.right != null && !this.right.equals(other.right)) return false;
        return true;
    }

    @Override
    public String toString() {
        return "" + val;
    }
}