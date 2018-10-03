package com.corindiano.leetcode.random;


class DoublyLinkedList {
    static class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "" + value;
        }
    }

    private Node head, tail;

    public void insertFirst(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node first = head;
            first.prev = node;
            node.next = first;
            head = node;
        }
    }

    public void delete(Node node) {
        if (node.prev != null) node.prev.next = node.next;
        if (node.next != null) node.next.prev = node.prev;
        if (head == node) head = node.next;
        if (tail == node) tail = node.prev;
    }

    public String printFwd() {
        StringBuilder sb = new StringBuilder("[");

        Node n = head;

        while (n != null) {
            sb.append(n.value).append(",");
            n = n.next;
        }

        if (sb.length() > 1) sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        System.out.println(sb);
        return sb.toString();
    }

    public String printBwd() {
        StringBuilder sb = new StringBuilder("[");

        Node n = tail;

        while (n != null) {
            sb.append(n.value).append(",");
            n = n.prev;
        }

        if (sb.length() > 1) sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        System.out.println(sb);
        return sb.toString();
    }
}