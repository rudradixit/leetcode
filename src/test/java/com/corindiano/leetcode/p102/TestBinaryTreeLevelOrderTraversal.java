package com.corindiano.leetcode.p102;

import com.corindiano.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBinaryTreeLevelOrderTraversal {
    @Test
    void testCase1() {
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = right;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<Integer>() {{ add(3); }});
        expected.add(new ArrayList<Integer>() {{ add(9); add(20); }});
        expected.add(new ArrayList<Integer>() {{ add(15); add(7); }});
        assertEquals(expected, BinaryTreeLevelOrderTraversal.levelOrder(root));
    }
}