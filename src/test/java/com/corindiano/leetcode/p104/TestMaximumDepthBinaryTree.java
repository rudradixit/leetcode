package com.corindiano.leetcode.p104;

import com.corindiano.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMaximumDepthBinaryTree {
    @Test
    void testCase1() {
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

        assertEquals(4, MaximumDepthBinaryTree.maxDepth(root));


    }
}