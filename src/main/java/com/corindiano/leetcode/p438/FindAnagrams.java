package com.corindiano.leetcode.p438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FindAnagrams {
    static List<Integer> findAnagrams(String s, String p) {
        int pSize = p.length();
        Map<Character, Integer> chars = new HashMap<>();

        for (Character c : p.toCharArray()) {
            chars.putIfAbsent(c, 0);
            chars.put(c, chars.get(c) + 1);
        }

        int begin = 0, end = 0, counter = chars.size();
        List<Integer> results = new ArrayList<>();

        while (end < s.length()) {
            char endChar = s.charAt(end);

            if (chars.containsKey(endChar)) {
                chars.put(endChar, chars.get(endChar)-1);
                if (chars.get(endChar) == 0) counter--;
            }

            end++;

            while (counter == 0) {
                if (end-begin == pSize) {
                    results.add(begin);
                }

                char beginChar = s.charAt(begin);
                if (chars.containsKey(beginChar)) {
                    chars.put(beginChar, chars.get(beginChar) + 1);
                    if (chars.get(beginChar) > 0) counter++;
                }

                begin++;
            }

        }

        return results;
    }
}