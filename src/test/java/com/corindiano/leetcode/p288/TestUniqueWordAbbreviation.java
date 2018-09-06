package com.corindiano.leetcode.p288;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestUniqueWordAbbreviation {
    @Test
    void testCase1() {
        String dictionary[] = { "deer", "door", "cake", "card" };
        UniqueWordAbbreviation uwa = new UniqueWordAbbreviation(dictionary);
        assertFalse(uwa.isUnique("dear"));
        assertTrue(uwa.isUnique("cart"));
        assertFalse(uwa.isUnique("cane"));
        assertTrue(uwa.isUnique("make"));
    }

    @Test
    void testCase2() {
        String dictionary[] = { "hello" };
        UniqueWordAbbreviation uwa = new UniqueWordAbbreviation(dictionary);
        assertTrue(uwa.isUnique("hello"));
    }
}