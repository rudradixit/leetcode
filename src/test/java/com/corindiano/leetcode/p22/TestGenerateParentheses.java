package com.corindiano.leetcode.p22;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestGenerateParentheses {
    @Test
    void testCase1() {
        List<String> expected = new ArrayList<>();
        expected.add("()");
        assertEquals(expected, GenerateParentheses.generateParenthesis(1));
    }

    @Test
    void testCase2() {
        List<String> expected = new ArrayList<>();
        expected.add("()()");
        expected.add("(())");
        assertEquals(expected, GenerateParentheses.generateParenthesis(2));
    }

    @Test
    void testCase3() {
        List<String> expected = new ArrayList<>();
        expected.add("()()()");
        expected.add("(())()");
        expected.add("()(())");
        expected.add("(()())");
        expected.add("((()))");
        List<String> results = GenerateParentheses.generateParenthesis(3);
        assertEquals(expected.size(), results.size());
        for (String r : results) if (!expected.contains(r)) fail();
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
        List<String> results = GenerateParentheses.generateParenthesis(4);
        assertEquals(expected.size(), results.size());
        for (String r : results) if (!expected.contains(r)) fail();
    }
}