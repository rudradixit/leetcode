package com.corindiano.leetcode.random.heaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

class SortAlmostSortedArray {
    static List<Integer> sort(int k, Iterator<Integer> it) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k + 1);

        for (int i=0; i<=k; i++) pq.offer(it.next());

        List<Integer> results = new ArrayList<>();

        while (it.hasNext()) {
            results.add(pq.poll());
            pq.offer(it.next());
        }

        int size = pq.size();
        for (int i=0; i<size; i++) results.add(pq.poll());

        return results;
    }
}