package com.corindiano.leetcode.random.heaps;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

class ComputeMedianStreamingData {
    static double compute(Iterator<Integer> it) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        while (it.hasNext()) {
            int v = it.next();

            min.offer(v);
            max.offer(min.poll());

            if (max.size() > min.size()) {
                min.offer(max.poll());
            }
        }

        if (min.size() > max.size()) return min.poll();
        return ((double) (min.poll() + max.poll()) / 2);
    }
}