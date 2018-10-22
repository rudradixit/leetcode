package com.corindiano.leetcode.p76;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMinimumWindowSubstring {
    @Test
    void testCase1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        assertEquals("BANC", MinimumWindowSubstring.minWindow(s, t));
    }
}