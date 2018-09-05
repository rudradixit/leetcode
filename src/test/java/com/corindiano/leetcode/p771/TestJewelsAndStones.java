package com.corindiano.leetcode.p771;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestJewelsAndStones {
    @Test
    void testCase1() {
        assertEquals(3, JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    void testCase2() {
        assertEquals(0, JewelsAndStones.numJewelsInStones("z", "ZZ"));
    }
}