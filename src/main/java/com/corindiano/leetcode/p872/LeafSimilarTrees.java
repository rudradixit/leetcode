package com.corindiano.leetcode.p872;

import com.corindiano.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Consider all the leaves of a binary tree.  From left to right order,
 * the values of those leaves form a leaf value sequence.
 * 	       3
 * 	    /    \
 * 	   5      1
 * 	  / \    / \
 * 	 6   2  9  8
 *      / \
 *     7  4
 *
 * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 *
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 *
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 *
 * Note:
 *
 * Both of the given trees will have between 1 and 100 nodes.
 */
class LeafSimilarTrees {
    private static void sequence(TreeNode t, List<Integer> seq) {
        if (t.left == null && t.right == null) {
            seq.add(t.val);
            return;
        }

        if (t.left != null) sequence(t.left, seq);
        if (t.right != null) sequence(t.right, seq);
    }

    static boolean leafSimilar(TreeNode t1, TreeNode t2) {
        List<Integer> seqT1 = new ArrayList<>();
        sequence(t1, seqT1);
        List<Integer> seqT2 = new ArrayList<>();
        sequence(t2, seqT2);
        return seqT1.equals(seqT2);
    }
}