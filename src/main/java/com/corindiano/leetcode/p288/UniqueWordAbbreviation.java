package com.corindiano.leetcode.p288;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * An abbreviation of a word follows the form <first letter><number><last letter>.
 * Below are some examples of word abbreviations:
 *
 * a) it                      --> it    (no abbreviation)
 *
 *      1
 *      ↓
 * b) d|o|g                   --> d1g
 *
 *               1    1  1
 *      1---5----0----5--8
 *      ↓   ↓    ↓    ↓  ↓
 * c) i|nternationalizatio|n  --> i18n
 *
 *               1
 *      1---5----0
 *      ↓   ↓    ↓
 * d) l|ocalizatio|n          --> l10n
 *
 * Assume you have a dictionary and given a word, find whether its abbreviation
 * is unique in the dictionary. A word's abbreviation is unique if no other word
 * from the dictionary has the same abbreviation.
 *
 * Example:
 *
 * Given dictionary = [ "deer", "door", "cake", "card" ]
 *
 * isUnique("dear") -> false
 * isUnique("cart") -> true
 * isUnique("cane") -> false
 * isUnique("make") -> true
 */
class UniqueWordAbbreviation {
    private Map<String, Set<String>> abbrevs = new HashMap<>();

    public UniqueWordAbbreviation(String[] dictionary) {
        String abbrev;
        Set<String> rawInputs;

        for (String d : dictionary) {
            abbrev = getAbbrev(d);

            if (!abbrevs.containsKey(abbrev)) {
                rawInputs = new HashSet<>();
            } else {
                rawInputs = abbrevs.get(abbrev);
            }

            rawInputs.add(d);
            abbrevs.put(abbrev, rawInputs);
        }
    }

    private String getAbbrev(String str) {
        if (str == null || str.length() < 3) return str;

        char c = str.charAt(0);
        char l = str.charAt(str.length() - 1);
        int mid = str.length() - 2;

        return "" + c + mid + l;
    }

    public boolean isUnique(String word) {
        String abbrev = getAbbrev(word);
        Set<String> rawInputs = abbrevs.get(abbrev);

        return rawInputs == null || (rawInputs.size() == 1 && rawInputs.iterator().next().equals(word));
    }
}