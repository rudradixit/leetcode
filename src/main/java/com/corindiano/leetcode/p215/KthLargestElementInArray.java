package com.corindiano.leetcode.p215;

import java.util.PriorityQueue;

class KthLargestElementInArray {
    static int findKthLargest(int[] nums, int k) {
        if (nums == null) throw new IllegalArgumentException("Invalid numbers!");
        if (k <= 0) throw new IllegalArgumentException("Invalid k!");
        if (k > nums.length) throw new IllegalArgumentException("Invalid k!");

        PriorityQueue<Integer> pq = new PriorityQueue<>(Integer::compare);

        for (int n : nums) {
            pq.add(n);

            if (pq.size() > k) pq.poll();
        }

        return pq.poll();
    }
}