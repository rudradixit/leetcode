package com.corindiano.leetcode.p76;

import java.util.HashMap;
import java.util.Map;

class MinimumWindowSubstring {
    static String minWindow(String s, String t) {
        Map<Character, Integer> hits = new HashMap<>();

        for (char c : t.toCharArray()) {
            if (!hits.containsKey(c)) {
                hits.put(c, 1);
            } else {
                hits.put(c, hits.get(c) + 1);
            }
        }

        int begin = 0, end = 0;
        int counter = hits.size();
        int len = Integer.MAX_VALUE;
        String min = "";

        while (end < s.length()) {
            char endChar = s.charAt(end);

            if (hits.containsKey(endChar)) {
                hits.put(endChar, hits.get(endChar) - 1);
                if (hits.get(endChar) == 0) counter--;
            }

            end++;

            while (counter == 0) {
                if (end-begin < len) {
                    len = end-begin;
                    min = s.substring(begin, end);
                }

                char beginChar = s.charAt(begin);

                if (hits.containsKey(beginChar)) {
                    hits.put(beginChar, hits.get(beginChar) + 1);
                    if (hits.get(beginChar) > 0) counter++;
                }

                begin++;
            }
        }

        return min;
    }
}