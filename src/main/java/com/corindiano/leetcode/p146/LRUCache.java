package com.corindiano.leetcode.p146;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    private static class DLLNode {
        int key;
        int value;
        DLLNode next;
        DLLNode prev;

        DLLNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{ \"key\": " + key + ", \"value\": " + value + " }";
        }
    }

    private DLLNode head, tail;
    private Map<Integer, DLLNode> cache;
    private int capacity;

    LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>(capacity);
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;

        DLLNode chosen = cache.get(key);
        delete(chosen);
        moveToFirst(chosen);

        return chosen.value;
    }

    public int size() {
        return cache.size();
    }

    public void put(int key, int value) {
        DLLNode node = new DLLNode(key, value);

        if (cache.containsKey(key)) {
            DLLNode existing = cache.get(key);
            existing.value = value;
            delete(existing);
            moveToFirst(existing);
        } else {
            if (size() == capacity) {
                cache.remove(tail.key);
                delete(tail);
            }

            moveToFirst(node);
            cache.put(key, node);
        }
    }

    private void moveToFirst(DLLNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            DLLNode first = head;
            first.prev = node;
            node.next = first;
            node.prev = null;
            head = node;
        }
    }

    private void delete(DLLNode node) {
        if (node.prev != null) node.prev.next = node.next;
        if (node.next != null) node.next.prev = node.prev;
        if (head == node) head = node.next;
        if (tail == node) tail = node.prev;
    }
}