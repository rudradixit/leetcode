package com.corindiano.leetcode.p654;

import com.corindiano.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TestMaximumBinaryTree {
    @Test
    void testCase0() {
        assertNull(MaximumBinaryTree.constructMaximumBinaryTree(null));
    }

    @Test
    void testCase1() {
        assertNull(MaximumBinaryTree.constructMaximumBinaryTree(new int[0]));
    }

    @Test
    void testCase2() {
        TreeNode n = new TreeNode(1);
        assertEquals(n, MaximumBinaryTree.constructMaximumBinaryTree(new int[]{1}));
    }

    @Test
    void testCase3() {
        TreeNode child = new TreeNode(1);
        TreeNode root = new TreeNode(6);
        root.left = child;

        assertEquals(root, MaximumBinaryTree.constructMaximumBinaryTree(new int[]{1, 6}));
    }

    @Test
    void testCase4() {
        TreeNode child = new TreeNode(1);
        TreeNode root = new TreeNode(6);
        root.right = child;

        assertEquals(root, MaximumBinaryTree.constructMaximumBinaryTree(new int[]{6, 1}));
    }

    @Test
    void testCase5() {
        TreeNode leftrightright = new TreeNode(1);
        TreeNode leftright = new TreeNode(2);
        leftright.right = leftrightright;
        TreeNode left = new TreeNode(3);
        left.right = leftright;
        TreeNode rightleft = new TreeNode(0);
        TreeNode right = new TreeNode(5);
        right.left = rightleft;
        TreeNode root = new TreeNode(6);
        root.left = left;
        root.right = right;

        assertEquals(root, MaximumBinaryTree.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5}));
    }
}