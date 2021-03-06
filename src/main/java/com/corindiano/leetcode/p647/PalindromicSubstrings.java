package com.corindiano.leetcode.p647;

/**
 * Given a string, your task is to count how many palindromic substrings in this string.
 *
 * The substrings with different start indexes or end indexes are counted as different
 * substrings even they consist of same characters.
 *
 * Example 1:
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 *
 * Example 2:
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 *
 * Note:
 * The input string length won't exceed 1000.
 */
class PalindromicSubstrings {
    private static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }

    static int countSubstrings(String s) {
        if (s == null || s.isEmpty()) return 0;

        int sum = 1;

        for (int i=1; i<s.length(); i++) {
            for (int j=i; j>=0; j--) {
                if (isPalindrome(s.substring(j, i + 1))) {
                    sum += 1;
                }
            }
        }

        return sum;
    }
}