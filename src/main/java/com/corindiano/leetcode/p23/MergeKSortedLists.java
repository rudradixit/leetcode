package com.corindiano.leetcode.p23;

import com.corindiano.leetcode.common.ListNode;

import java.util.PriorityQueue;

class MergeKSortedLists {
    static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Integer::compare);

        for (ListNode ln : lists) {
            ListNode runner = ln;

            while (runner != null) {
                pq.add(runner.val);
                runner = runner.next;
            }
        }

        if (pq.isEmpty()) return null;

        ListNode head = new ListNode(pq.poll());
        ListNode node = head;
        Integer v;

        while ((v = pq.poll()) != null) {
            node.next = new ListNode(v);
            node = node.next;
        }

        return head;
    }
}