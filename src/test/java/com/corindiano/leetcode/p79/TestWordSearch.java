package com.corindiano.leetcode.p79;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestWordSearch {
    @Test
    void testCase1() {
        char[][] board = new char[][] {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        assertTrue(WordSearch.exist(board, "ABCCED"));
        assertTrue(WordSearch.exist(board, "SEE"));
        assertFalse(WordSearch.exist(board, "ABCB"));
    }

    @Test
    void testCase2() {
        char[][] board = new char[][] {
            {'a'}
        };

        assertTrue(WordSearch.exist(board, "a"));
    }

    @Test
    void testCase3() {
        char[][] board = new char[][] {
            {'a', 'b'}
        };

        assertTrue(WordSearch.exist(board, "ba"));
    }

    @Test
    void testCase4() {
        char[][] board = new char[][] {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'E', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        assertTrue(WordSearch.exist(board, "ABCESEEEFS"));
    }

    @Test
    void testCase5() {
        char[][] board = new char[][] {
            {'a', 'b'},
            {'c', 'd'}
        };

        assertFalse(WordSearch.exist(board, "abcd"));
    }
}