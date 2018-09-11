package com.corindiano.leetcode.random;

import java.util.ArrayList;
import java.util.List;

class StringPermutationRecursive {
    private static List<String> generate(String str) {
        List<String> results = new ArrayList<>();

        if (str.length() == 2) {
            results.add(str);
            String rev = "" + str.charAt(1) + str.charAt(0);
            results.add(rev);
            return results;
        }

        StringBuilder sb;

        for (int i=0; i<str.length(); i++) {
            sb = new StringBuilder(str);
            sb.deleteCharAt(i);

            for (String s1 : generate(sb.toString()))
                results.add(str.charAt(i) + s1);
        }

        return results;
    }

    public static void main(String[] args) {
        System.out.println(generate("abcd"));
    }
}