package com.corindiano.leetcode.p295;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    private PriorityQueue<Integer> min, max;

    public MedianFinder() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        min.offer(num);
        max.offer(min.poll());

        if (max.size() > min.size()) min.offer(max.poll());
    }

    public double findMedian() {
        if (min.size() > max.size()) return min.peek();

        return ((double)(min.peek() + max.peek()) / 2);
    }
}