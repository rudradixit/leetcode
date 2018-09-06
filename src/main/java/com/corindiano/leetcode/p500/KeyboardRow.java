package com.corindiano.leetcode.p500;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class KeyboardRow {
    static String[] findWords(String[] words) {
        Set<Character> firstRow = new HashSet<>();
        firstRow.add('q');
        firstRow.add('w');
        firstRow.add('e');
        firstRow.add('r');
        firstRow.add('t');
        firstRow.add('y');
        firstRow.add('u');
        firstRow.add('i');
        firstRow.add('o');
        firstRow.add('p');

        Set<Character> secondRow = new HashSet<>();
        secondRow.add('a');
        secondRow.add('s');
        secondRow.add('d');
        secondRow.add('f');
        secondRow.add('g');
        secondRow.add('h');
        secondRow.add('j');
        secondRow.add('k');
        secondRow.add('l');

        Set<Character> thirdRow = new HashSet<>();
        thirdRow.add('z');
        thirdRow.add('x');
        thirdRow.add('c');
        thirdRow.add('v');
        thirdRow.add('b');
        thirdRow.add('n');
        thirdRow.add('m');

        List<String> results = new ArrayList<>();
        char[] array;

        for (String w : words) {
            array = w.toCharArray();
            boolean belongsRow1 = belongsTo(array, firstRow);
            boolean belongsRow2 = belongsTo(array, secondRow);
            boolean belongsRow3 = belongsTo(array, thirdRow);

            if (belongsRow1 || belongsRow2 || belongsRow3) results.add(w);
        }

        return results.toArray(new String[0]);
    }

    private static boolean belongsTo(char[] array, Set<Character> row) {
        for (Character c : array) {
            if (!row.contains(Character.toLowerCase(c))) return false;
        }

        return true;
    }
}