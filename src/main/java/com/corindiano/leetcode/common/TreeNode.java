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
        if (obj == null) {
            System.err.println("obj is null!");
            return false;
        }
        if (this == obj) return true;
        if (!(obj instanceof TreeNode)) {
            System.err.println("obj is not a TreeNode!");
            return false;
        }

        TreeNode other = (TreeNode) obj;

        if (this.val != other.val) {
            System.err.println("vals don't match!");
            return false;
        }
        if (this.left == null && other.left != null) {
            System.err.println("this has no left!");
            return false;
        }
        if (this.left != null && other.left == null) {
            System.err.println("other has no left!");
            return false;
        }
        if (this.left != null && !this.left.equals(other.left)) {
            System.err.println("lefts don't match!");
            return false;
        }
        if (this.right == null && other.right != null){
            System.err.println("this has no right!");
            return false;
        }
        if (this.right != null && other.right == null) {
            System.err.println("other has no right!");
            return false;
        }
        if (this.right != null && !this.right.equals(other.right)) {
            System.err.println("rights don't match");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + val;
    }
}