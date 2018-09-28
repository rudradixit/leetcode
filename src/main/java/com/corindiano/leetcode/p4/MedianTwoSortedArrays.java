package com.corindiano.leetcode.p4;

import java.util.PriorityQueue;

class MedianTwoSortedArrays {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>((i1, i2) -> Integer.compare(i2, i1));
        int i=0, j=0;

        while (i < nums1.length || j < nums2.length) {
            int val = (i < nums1.length) ? nums1[i++] : nums2[j++];

            min.offer(val);
            max.offer(min.poll());

            if (max.size() > min.size()) {
                min.offer(max.poll());
            }
        }

        int total = nums1.length + nums2.length;

        return (total % 2 == 1) ?
            min.peek() :
            ((double)(min.peek() + max.peek()) / 2);
    }
}