package com.corindiano.leetcode.p654;

import com.corindiano.leetcode.common.TreeNode;

class MaximumBinaryTree {
    private static int findMaxPos(int[] array, int start, int end) {
        int max = Integer.MIN_VALUE;
        int pos = -1;

        for (int i=start; i<=end; i++) {
            if (array[i] > max) {
                max = array[i];
                pos = i;
            }
        }

        return pos;
    }

    private static TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {
        if (start > end) return null;

        int maxPos = findMaxPos(nums, start, end);
        TreeNode root = new TreeNode(nums[maxPos]);

        int leftEnd = maxPos - 1;
        int rightStart = maxPos + 1;

        root.left = constructMaximumBinaryTree(nums, start, leftEnd);
        root.right = constructMaximumBinaryTree(nums, rightStart, end);
        return root;
    }

    static TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }
}