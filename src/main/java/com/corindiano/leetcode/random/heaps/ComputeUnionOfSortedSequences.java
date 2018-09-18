package com.corindiano.leetcode.random.heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class ComputeUnionOfSortedSequences {
    private static class PQEntry {
        int listId;
        int value;

        public PQEntry(int listId, int value) {
            this.listId = listId;
            this.value = value;
        }
    }

    static List<Integer> mergeSortedArrays(List<List<Integer>> lists) {
        PriorityQueue<PQEntry> pq = new PriorityQueue<>(lists.size(),
            (e1, e2) -> Integer.compare(e1.value, e2.value)
        );

        for (int i=0; i<lists.size(); i++) pq.add(new PQEntry(i, lists.get(i).remove(0)));

        List<Integer> results = new ArrayList<>();

        while (!pq.isEmpty()) {
            PQEntry head = pq.poll();
            results.add(head.value);

            if (!lists.get(head.listId).isEmpty())
                pq.add(new PQEntry(head.listId, lists.get(head.listId).remove(0)));
        }

        return results;
    }
}