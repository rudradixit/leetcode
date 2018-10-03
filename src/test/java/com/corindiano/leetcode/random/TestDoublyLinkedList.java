package com.corindiano.leetcode.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestDoublyLinkedList {
    @Test
    void testCase1() {
        DoublyLinkedList dll = new DoublyLinkedList();
        DoublyLinkedList.Node node1 = new DoublyLinkedList.Node(1);
        dll.insertFirst(node1);
        DoublyLinkedList.Node node2 = new DoublyLinkedList.Node(2);
        dll.insertFirst(node2);
        DoublyLinkedList.Node node3 = new DoublyLinkedList.Node(3);
        dll.insertFirst(node3);
        assertEquals("[3,2,1]", dll.printFwd());
        assertEquals("[1,2,3]", dll.printBwd());
        dll.delete(node3);
        assertEquals("[2,1]", dll.printFwd());
        assertEquals("[1,2]", dll.printBwd());
        node3 = new DoublyLinkedList.Node(3);
        dll.insertFirst(node3);
        assertEquals("[3,2,1]", dll.printFwd());
        assertEquals("[1,2,3]", dll.printBwd());
        dll.delete(node2);
        assertEquals("[3,1]", dll.printFwd());
        assertEquals("[1,3]", dll.printBwd());
        dll.delete(node1);
        assertEquals("[3]", dll.printFwd());
        assertEquals("[3]", dll.printBwd());
        dll.delete(node3);
        assertEquals("[]", dll.printFwd());
        assertEquals("[]", dll.printBwd());
    }
}