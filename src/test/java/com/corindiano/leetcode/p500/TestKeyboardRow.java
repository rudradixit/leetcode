package com.corindiano.leetcode.p500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TestKeyboardRow {
    @Test
    void testCase1() {
        String[] words = { "Hello", "Alaska", "Dad", "Peace" };
        String[] expected = { "Alaska", "Dad" };
        assertArrayEquals(expected, KeyboardRow.findWords(words));
    }
}