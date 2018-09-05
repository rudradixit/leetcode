package com.corindiano.leetcode.random;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestParenthesesPermutations {
    @Test
    void testCase1() {
        Set<String> results = ParenthesesPermutations.validPermutations(1);
        assertEquals(1, results.size());
        assertEquals("()", results.iterator().next());
    }

    @Test
    void testCase2() {
        Set<String> results = ParenthesesPermutations.validPermutations(2);
        assertEquals(2, results.size());
        assertTrue(results.contains("(())"));
        assertTrue(results.contains("()()"));
    }

    @Test
    void testCase3() {
        Set<String> results = ParenthesesPermutations.validPermutations(3);
        assertEquals(5, results.size());
        assertTrue(results.contains("()(())"));
        assertTrue(results.contains("(()())"));
        assertTrue(results.contains("((()))"));
        assertTrue(results.contains("(())()"));
        assertTrue(results.contains("()()()"));
    }

    @Test
    void testCase4() {
        Set<String> expected = new HashSet<>();
        expected.add("()()(())");
        expected.add("(())(())");
        expected.add("()(()())");
        expected.add("()((()))");
        expected.add("()(())()");
        expected.add("(()()())");
        expected.add("((())())");
        expected.add("(()(()))");
        expected.add("(()())()");
        expected.add("((()()))");
        expected.add("(((())))");
        expected.add("((()))()");
        expected.add("(())()()");
        expected.add("()()()()");

        Set<String> results = ParenthesesPermutations.validPermutations(4);
        assertEquals(expected, results);
    }
}