package com.corindiano.leetcode.random;

import java.util.HashSet;
import java.util.Set;

class ParenthesesPermutations {
    private static void _validPermutations(String str, int n, int opens, int closes, Set<String> results) {
        if (opens < 0 || closes < 0) return;

        if (str.length() == n * 2) {
            results.add(str);
            return;
        }

        if (opens == closes) {
            _validPermutations(str + "(", n, opens - 1, closes, results);
        } else if (opens < closes) {
            _validPermutations(str + "(", n, opens - 1, closes, results);
            _validPermutations(str + ")", n, opens, closes - 1, results);
        }
    }

    static Set<String> validPermutations(int n) {
        if (n < 0) throw new IllegalArgumentException("Invalid N");
        Set<String> results = new HashSet<>();

        _validPermutations("", n, n, n, results);

        return results;
    }
}