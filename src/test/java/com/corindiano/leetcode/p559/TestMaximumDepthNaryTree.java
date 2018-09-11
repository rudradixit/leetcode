package com.corindiano.leetcode.p559;

import com.corindiano.leetcode.common.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMaximumDepthNaryTree {
    @Test
    void testCase1() {
        Node grandchild1 = new Node(5, null);
        Node grandchild2 = new Node(6, null);
        List<Node> grandchildren1 = new ArrayList<>();
        grandchildren1.add(grandchild1);
        grandchildren1.add(grandchild2);
        Node child1 = new Node(3, grandchildren1);
        Node child2 = new Node(2, null);
        Node child3 = new Node(4, null);
        List<Node> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Node n = new Node(1, children);

        assertEquals(3, MaximumDepthNaryTree.maxDepth(n));
    }

    @Test
    void testCase2() {
        Node greatgrandchild1 = new Node(6, null);
        List<Node> greatgrandchildren1 = new ArrayList<>();
        greatgrandchildren1.add(greatgrandchild1);
        Node grandchild1 = new Node(5, greatgrandchildren1);
        List<Node> grandchildren1 = new ArrayList<>();
        grandchildren1.add(grandchild1);
        Node child1 = new Node(4, grandchildren1);
        List<Node> children = new ArrayList<>();
        children.add(child1);
        Node n = new Node(3, children);

        assertEquals(4, MaximumDepthNaryTree.maxDepth(n));
    }
}