package com.corindiano.leetcode.p3;

import java.util.HashMap;
import java.util.Map;

class LongestSubstringWithoutRepeatingChars {
    static int lengthOfLongestSubstring(String s) {
        int begin=0, end=0, max=0;
        Map<Character, Integer> seen = new HashMap<>();

        while (end < s.length()) {
            char current = s.charAt(end);

            if (!seen.containsKey(current) || begin > seen.get(current)) {
                seen.put(current, end);
                end++;
            } else {
                if (seen.get(current) >= begin) {
                    begin = seen.get(current)+1;
                }
            }

            max = Math.max(max, end-begin);
        }

        return max;
    }
}