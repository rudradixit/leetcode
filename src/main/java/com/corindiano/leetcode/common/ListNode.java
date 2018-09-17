package com.corindiano.leetcode.common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            System.err.println("obj is null!");
            return false;
        }
        if (this == obj) return true;
        if (!(obj instanceof ListNode)) {
            System.err.println("obj is not a ListNode!");
            return false;
        }

        ListNode other = (ListNode) obj;

        if (this.val != other.val) {
            System.err.println("vals don't match!");
            return false;
        }
        if (this.next == null && other.next != null) {
            System.err.println("this has no next!");
            return false;
        }
        if (this.next != null && other.next == null) {
            System.err.println("other has no next!");
            return false;
        }
        if (this.next != null && !this.next.equals(other.next)) {
            System.err.println("nexts don't match!");
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "" + val;
    }
}