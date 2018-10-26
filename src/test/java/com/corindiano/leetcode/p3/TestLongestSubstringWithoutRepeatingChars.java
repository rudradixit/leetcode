package com.corindiano.leetcode.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestLongestSubstringWithoutRepeatingChars {
    @Test
    void testCase1() {
        String s = "abcabcbb";
        assertEquals(3, LongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(s));
    }

    @Test
    void testCase2() {
        String s = "bbbbb";
        assertEquals(1, LongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(s));
    }

    @Test
    void testCase3() {
        String s = "pwwkew";
        assertEquals(3, LongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(s));
    }
}