package com.corindiano.leetcode.p236;

import com.corindiano.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestLowestCommonAncestorBinaryTree {
    @Test
    void testCase1() {
        assertNull(LCABinaryTree.lca(null, null, null));
    }

    @Test
    void testCase2() {
        TreeNode root = new TreeNode(1);
        assertEquals(root, LCABinaryTree.lca(root, root, root));
    }

    @Test
    void testCase3() {
        TreeNode child = new TreeNode(2);
        TreeNode root = new TreeNode(1);
        root.left = child;
        assertEquals(root, LCABinaryTree.lca(root, child, root));
    }

    @Test
    void testCase4() {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1);
        root.left = left;
        root.right = right;
        assertEquals(root, LCABinaryTree.lca(root, left, right));
    }

    private TreeNode buildTree() {
        TreeNode leftleft = new TreeNode(6);
        TreeNode leftrightleft = new TreeNode(7);
        TreeNode leftrightright = new TreeNode(4);
        TreeNode leftright = new TreeNode(2);
        leftright.left = leftrightleft;
        leftright.right = leftrightright;
        TreeNode left = new TreeNode(5);
        left.left = leftleft;
        left.right = leftright;
        TreeNode rightleft = new TreeNode(0);
        TreeNode rightright = new TreeNode(8);
        TreeNode right = new TreeNode(1);
        right.left = rightleft;
        right.right = rightright;
        TreeNode root = new TreeNode(3);
        root.left = left;
        root.right = right;
        return root;
    }

    @Test
    void testCase5() {
        TreeNode root = buildTree();
        assertEquals(root, LCABinaryTree.lca(root, root.left.left, root.right.right));
    }

    @Test
    void testCase6() {
        TreeNode root = buildTree();
        assertEquals(root.left, LCABinaryTree.lca(root, root.left, root.left.right.right));
    }

    @Test
    void testCase7() {
        TreeNode root = buildTree();
        assertEquals(root.left.right, LCABinaryTree.lca(root, root.left.right.left, root.left.right.right));
    }
}