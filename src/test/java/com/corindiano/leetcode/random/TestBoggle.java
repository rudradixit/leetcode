package com.corindiano.leetcode.random;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBoggle {
    @Test
    void findWords() {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("pi");
        dictionary.add("pin");
        dictionary.add("pine");
        dictionary.add("app");
        dictionary.add("ape");
        dictionary.add("apple");
        dictionary.add("pineapple");

        char[][] input = {
            {'p', 'a', 'p'},
            {'i', 'e', 'p'},
            {'n', 'e', 'l'}
        };

        Set<String> actual = Boggle.findWords(input, dictionary);
        assertEquals(dictionary.size(), actual.size());
    }
}