package com.corindiano.leetcode.p700;

import com.corindiano.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TestSearchBinaryTree {
    private void toString(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }

        toString(root.left, sb);
        sb.append(root.val).append(",");
        toString(root.right, sb);
    }

    @Test
    void testCase1() {
        TreeNode t1LeftLeft = new TreeNode(5);
        TreeNode t1Left = new TreeNode(3);
        t1Left.left = t1LeftLeft;
        TreeNode t1Right = new TreeNode(2);
        TreeNode t1 = new TreeNode(1);
        t1.left = t1Left;
        t1.right = t1Right;

        TreeNode r = SearchBinaryTree.searchBST(t1, 2);
        StringBuilder sb = new StringBuilder();
        toString(r, sb);
        assertEquals("null,2,null,", sb.toString());
    }

    @Test
    void testCase2() {
        TreeNode t1LeftLeft = new TreeNode(5);
        TreeNode t1Left = new TreeNode(3);
        t1Left.left = t1LeftLeft;
        TreeNode t1Right = new TreeNode(2);
        TreeNode t1 = new TreeNode(1);
        t1.left = t1Left;
        t1.right = t1Right;

        TreeNode r = SearchBinaryTree.searchBST(t1, 99);
        assertNull(r);
    }
}