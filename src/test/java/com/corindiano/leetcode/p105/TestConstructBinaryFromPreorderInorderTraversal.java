package com.corindiano.leetcode.p105;

import com.corindiano.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestConstructBinaryFromPreorderInorderTraversal {
    @Test
    void testCase1() {
        TreeNode right = new TreeNode(3);
        TreeNode left = new TreeNode(2);
        TreeNode root = new TreeNode(1);
        root.left = left;
        root.right = right;

        int[] preorder = new int[]{1, 2, 3};
        int[] inorder = new int[]{2, 1, 3};
        TreeNode r = ConstructBinaryFromPreorderInorderTraversal.buildTree(preorder, inorder);
        assertEquals(root, r);
    }

    @Test
    void testCase2() {
        TreeNode leftright = new TreeNode(3);
        TreeNode left = new TreeNode(2);
        left.right = leftright;
        TreeNode root = new TreeNode(1);
        root.left = left;

        int[] preorder = new int[]{1, 2, 3};
        int[] inorder = new int[]{2, 3, 1};
        assertEquals(root, ConstructBinaryFromPreorderInorderTraversal.buildTree(preorder, inorder));
    }

    @Test
    void testCase3() {
        TreeNode leftleft = new TreeNode(3);
        TreeNode left = new TreeNode(2);
        left.left = leftleft;
        TreeNode root = new TreeNode(1);
        root.left = left;

        int[] preorder = new int[]{1, 2, 3};
        int[] inorder = new int[]{3, 2, 1};
        assertEquals(root, ConstructBinaryFromPreorderInorderTraversal.buildTree(preorder, inorder));
    }

    @Test
    void testCase4() {
        TreeNode rightleft = new TreeNode(3);
        TreeNode right = new TreeNode(2);
        right.left = rightleft;
        TreeNode root = new TreeNode(1);
        root.right = right;

        int[] preorder = new int[]{1, 2, 3};
        int[] inorder = new int[]{1, 3, 2};
        assertEquals(root, ConstructBinaryFromPreorderInorderTraversal.buildTree(preorder, inorder));
    }

    @Test
    void testCase5() {
        TreeNode rightright = new TreeNode(3);
        TreeNode right = new TreeNode(2);
        right.right = rightright;
        TreeNode root = new TreeNode(1);
        root.right = right;

        int[] preorder = new int[]{1, 2, 3};
        int[] inorder = new int[]{1, 2, 3};
        assertEquals(root, ConstructBinaryFromPreorderInorderTraversal.buildTree(preorder, inorder));
    }

    @Test
    void testCase99() {
        TreeNode rightleft = new TreeNode(15);
        TreeNode rightright = new TreeNode(7);
        TreeNode right = new TreeNode(20);
        right.left = rightleft;
        right.right = rightright;
        TreeNode left = new TreeNode(9);
        TreeNode root = new TreeNode(3);
        root.left = left;
        root.right = right;

        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        assertEquals(root, ConstructBinaryFromPreorderInorderTraversal.buildTree(preorder, inorder));
    }
}