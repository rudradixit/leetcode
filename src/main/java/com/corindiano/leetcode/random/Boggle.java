package com.corindiano.leetcode.random;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Boggle {
    static void _findWords(char[][] chars, Set<String> dictionary, boolean[][] used, int r, int c, String sol, Set<String> words) {
        if (r < 0 || r >= chars.length) return;
        if (c < 0 || c >= chars[r].length) return;
        if (dictionary.contains(sol)) words.add(sol);
        if (used[r][c]) return;

        used[r][c] = true;

        for (int i=-1; i<=1; i++)
            for (int j=-1; j<=1; j++)
                _findWords(chars, dictionary, used, r+i, c+j, sol + chars[r][c], words);

        used[r][c] = false;
    }

    static Set<String> findWords(char[][] chars, Set<String> dictionary) {
        if (chars == null || chars.length == 0) return Collections.emptySet();

        boolean[][] used = new boolean[chars.length][chars[0].length];
        Set<String> words = new HashSet<>();

        for (int r=0; r<chars.length; r++)
            for (int c=0; c<chars[r].length; c++) {
                _findWords(chars, dictionary, used, r, c, "", words);
            }

        return words;
    }
}