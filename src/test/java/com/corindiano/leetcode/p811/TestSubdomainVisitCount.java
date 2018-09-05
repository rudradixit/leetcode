package com.corindiano.leetcode.p811;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSubdomainVisitCount {
    @Test
    void testCase1() {
        List<String> expected = new ArrayList<>();
        expected.add("9001 discuss.leetcode.com");
        expected.add("9001 leetcode.com");
        expected.add("9001 com");
        Collections.sort(expected);
        String[] domains = {"9001 discuss.leetcode.com"};
        List<String> actual = SubdomainVisitCount.subdomainVisits(domains);
        Collections.sort(actual);
        assertEquals(expected, actual);
    }

    @Test
    void testCase2() {
        List<String> expected = new ArrayList<>();
        expected.add("901 mail.com");
        expected.add("50 yahoo.com");
        expected.add("900 google.mail.com");
        expected.add("5 wiki.org");
        expected.add("5 org");
        expected.add("1 intel.mail.com");
        expected.add("951 com");
        Collections.sort(expected);
        String[] domains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> actual = SubdomainVisitCount.subdomainVisits(domains);
        Collections.sort(actual);
        assertEquals(expected, actual);
    }
}