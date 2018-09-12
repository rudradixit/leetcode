package com.corindiano.leetcode.p590;

import com.corindiano.leetcode.common.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestNaryTreePostorderTraversal {
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

        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(6);
        expected.add(3);
        expected.add(2);
        expected.add(4);
        expected.add(1);
        assertEquals(expected, NaryTreePostorderTraversal.postorder(n));
    }
}