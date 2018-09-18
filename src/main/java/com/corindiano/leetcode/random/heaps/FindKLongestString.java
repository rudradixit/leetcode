package com.corindiano.leetcode.random.heaps;

import java.util.*;

class FindKLongestString {
    static List<String> topK(int k, Iterator<String> it) {
        PriorityQueue<String> pq = new PriorityQueue<>(
            Comparator.comparingInt(String::length)
        );

        while (it.hasNext()) {
            pq.add(it.next());

            if (pq.size() > k) pq.poll();
        }

        return new ArrayList<>(pq);
    }
}