package com.corindiano.leetcode.p647;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestPalindromicSubstrings {
    @Test
    public void testCase1() {
        assertEquals(3, PalindromicSubstrings.countSubstrings("abc"));
    }

    @Test
    public void testCase2() {
        assertEquals(6, PalindromicSubstrings.countSubstrings("aaa"));
    }

    @Test
    public void testCase3() {
        assertEquals(11, PalindromicSubstrings.countSubstrings("abaaba"));
    }
}