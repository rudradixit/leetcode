package com.corindiano.leetcode.p105;

import com.corindiano.leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

class ConstructBinaryFromPreorderInorderTraversal {
    static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) return null;
        if (preorder.length == 0 || inorder.length == 0) return null;
        if (preorder.length != inorder.length) return null;

        Map<Integer, Integer> inorderMap = new HashMap<>();

        for (int i=0; i<inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);

        for (int i=1; i<preorder.length; i++) {
            int val = preorder[i];
            int valPos = inorderMap.get(val);
            TreeNode node = root, parent = null;
            int nodePos = inorderMap.get(node.val);

            while (node != null) {
                parent = node;

                if (nodePos > valPos) node = node.left;
                if (nodePos < valPos) node = node.right;

                if (node != null) nodePos = inorderMap.get(node.val);
            }

            if (nodePos < valPos) parent.right = new TreeNode(val);
            if (nodePos > valPos) parent.left = new TreeNode(val);
        }

        return root;
    }
}