package com.corindiano.leetcode.p173;

import com.corindiano.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator {
    private TreeNode root;
    private List<Integer> cache = new ArrayList<>();
    private int idx = 0;

    public BSTIterator(TreeNode root) {
        traverse(root);
    }

    private void traverse(TreeNode root) {
        if (root == null) return;

        traverse(root.left);
        cache.add(root.val);
        traverse(root.right);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !cache.isEmpty() && (idx < cache.size());
    }

    /** @return the next smallest number */
    public int next() {
        return cache.get(idx++);
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */