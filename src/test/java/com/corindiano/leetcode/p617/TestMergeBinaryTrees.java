package com.corindiano.leetcode.p617;

import com.corindiano.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMergeBinaryTrees {
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

        TreeNode t2LeftRight = new TreeNode(4);
        TreeNode t2Left = new TreeNode(1);
        t2Left.right = t2LeftRight;
        TreeNode t2RightRight = new TreeNode(7);
        TreeNode t2Right = new TreeNode(3);
        t2Right.right = t2RightRight;
        TreeNode t2 = new TreeNode(2);
        t2.left = t2Left;
        t2.right = t2Right;

        StringBuilder sb = new StringBuilder();
        toString(MergeBinaryTrees.mergeTrees(t1, t2), sb);
        assertEquals("null,5,null,4,null,4,null,3,null,5,null,7,null,", sb.toString());
    }
}