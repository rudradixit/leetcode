package com.corindiano.leetcode.p347;

import java.util.*;

class TopKFrequentElements {
    private static class Frequency {
        int num;
        int hits;

        public Frequency(int num, int hits) {
            this.num = num;
            this.hits = hits;
        }
    }

    static List<Integer> topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new ArrayList<>();
        if (k <= 0) return new ArrayList<>();

        Map<Integer, Integer> hits = new HashMap<>();

        for (int n : nums) {
            if (hits.containsKey(n)) {
                hits.put(n, hits.get(n) + 1);
            } else {
                hits.put(n, 1);
            }
        }

        PriorityQueue<Frequency> pq = new PriorityQueue<>(
            (f1, f2) -> Integer.compare(f2.hits, f1.hits)
        );

        for (Integer key : hits.keySet()) {
            pq.add(new Frequency(key, hits.get(key)));
        }

        List<Integer> results = new ArrayList<>(k);

        while (k > 0) {
            Frequency f = pq.poll();

            if (f != null) {
                results.add(f.num);
            }

            k--;
        }

        return results;
    }
}