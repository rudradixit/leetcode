package com.corindiano.leetcode.p22;

import java.util.*;

class GenerateParentheses {
    private static final String COUPLE = "()";

    private static void _generate(int n, String str, Set<String> results) {
        if (n == 0) {
            results.add(str);
            return;
        }

        for (int i=0; i<=str.length(); i++) {
            if (i == 0) {
                _generate(n-1, COUPLE + str, results);
            } else if (i == str.length()) {
                _generate(n-1, str + COUPLE, results);
            } else {
                _generate(n-1, str.substring(0, i) + COUPLE + str.substring(i), results);
            }
        }
    }

    static List<String> generateParenthesis(int n) {
        if (n <= 0) return Collections.emptyList();

        Set<String> results = new HashSet<>();
        _generate(n-1, COUPLE, results);
        return new ArrayList<>(results);
    }
}