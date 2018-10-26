package com.corindiano.leetcode.p438;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestFindAnagrams {
    @Test
    void testCase1() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(6);

        List<Integer> results = FindAnagrams.findAnagrams(s, p);
        assertEquals(expected.size(), results.size());

        for (Integer r : results)
            if (!expected.contains(r)) fail();
    }

    @Test
    void testCase2() {
        String s = "abab";
        String p = "ab";
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);

        List<Integer> results = FindAnagrams.findAnagrams(s, p);
        assertEquals(expected.size(), results.size());

        for (Integer r : results)
            if (!expected.contains(r)) fail();
    }
}