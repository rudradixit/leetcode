package com.corindiano.leetcode.random.heaps;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestFindKLongestString {
    @Test
    void testCase1() {
        List<String> expected = new ArrayList<>();
        expected.add("super");
        expected.add("coffee");
        expected.add("gambling");
        expected.add("important");
        expected.add("excellency");

        List<String> input = new ArrayList<>();
        input.add("a");
        input.add("bat");
        input.add("gambling");
        input.add("cry");
        input.add("and");
        input.add("coffee");
        input.add("excellency");
        input.add("at");
        input.add("the");
        input.add("super");
        input.add("try");
        input.add("important");
        input.add("that");
        input.add("bye");

        List<String> actual = FindKLongestString.topK(5, input.iterator());
        assertEquals(expected.size(), actual.size());
        List<String> diff = new ArrayList<>(actual);
        diff.removeAll(expected);
        assertTrue(diff.isEmpty());
    }
}