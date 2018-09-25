package com.corindiano.leetcode.random.graphs;

import com.corindiano.leetcode.common.Node;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TestGraphTraversals {
    private List<Node> children(Node... children) {
        return Arrays.asList(children);
    }

    @Test
    void testCaseDFS1() {
        Node n7 = new Node(7, children());
        Node n6 = new Node(6, children());
        Node n5 = new Node(5, children());
        Node n3 = new Node(3, children(n7));
        Node n4 = new Node(4, children(n5, n6));
        Node n2 = new Node(2, children(n4, n3));
        Node n1 = new Node(1, children(n2));

        Integer[] expected = {1, 2, 3, 7, 4, 6, 5};
        assertArrayEquals(expected, GraphTraversals.dfs(n1));
    }

    @Test
    void testCaseBFS1() {
        Node n7 = new Node(7, children());
        Node n6 = new Node(6, children());
        Node n5 = new Node(5, children());
        Node n3 = new Node(3, children(n7));
        Node n4 = new Node(4, children(n5, n6));
        Node n2 = new Node(2, children(n4, n3));
        Node n1 = new Node(1, children(n2));

        Integer[] expected = {1, 2, 4, 3, 5, 6, 7};
        assertArrayEquals(expected, GraphTraversals.bfs(n1));
    }
}