package com.corindiano.leetcode.p559;

import com.corindiano.leetcode.common.Node;

/**
 * Given a n-ary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the
 * root node down to the farthest leaf node.
 *
 * For example, given a 3-ary tree:
 * 	        1
 * 	    /   |   \
 * 	   3    2    4
 * 	  / \
 * 	 5   6
 *
 * We should return its max depth, which is 3.
 *
 * Note:
 *
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */
class MaximumDepthNaryTree {
    static int maxDepth(Node root) {
        if (root == null) return 0;
        if (root.children == null) return 1;

        int max = 0;

        for (Node child : root.children) {
            int d = 1 + maxDepth(child);

            if (d > max) max = d;
        }

        return max;
    }
}