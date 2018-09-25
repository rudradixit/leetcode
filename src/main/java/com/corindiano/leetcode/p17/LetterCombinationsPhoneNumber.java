package com.corindiano.leetcode.p17;

import java.util.*;

class LetterCombinationsPhoneNumber {
    private Map<Character, Set<Character>> letters = new HashMap<>();

    public LetterCombinationsPhoneNumber() {
        letters.put('2', new HashSet<Character>() {{ add('a'); add('b'); add('c'); }});
        letters.put('3', new HashSet<Character>() {{ add('d'); add('e'); add('f'); }});
        letters.put('4', new HashSet<Character>() {{ add('g'); add('h'); add('i'); }});
        letters.put('5', new HashSet<Character>() {{ add('j'); add('k'); add('l'); }});
        letters.put('6', new HashSet<Character>() {{ add('m'); add('n'); add('o'); }});
        letters.put('7', new HashSet<Character>() {{ add('p'); add('q'); add('r'); add('s'); }});
        letters.put('8', new HashSet<Character>() {{ add('t'); add('u'); add('v'); }});
        letters.put('9', new HashSet<Character>() {{ add('w'); add('x'); add('y'); add('z'); }});
    }

    private void _letterComb(String digits, int idx, String str, List<String> results) {
        if (idx == digits.length()) {
            results.add(str);
            return;
        }

        for (Character c : letters.get(digits.charAt(idx))) {
            _letterComb(digits, idx+1, str + c, results);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return Collections.emptyList();

        List<String> results = new ArrayList<>();
        _letterComb(digits, 0, "", results);
        return results;
    }
}