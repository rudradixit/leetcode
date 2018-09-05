package com.corindiano.leetcode.p760;

import java.util.HashMap;
import java.util.Map;

class FindAnagramMappings {
    static int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> bMap = new HashMap<>();

        for (int i=0; i<B.length; i++) {
            bMap.put(B[i], i);
        }

        int[] results = new int[A.length];

        for (int j=0; j<A.length; j++) {
            results[j] = bMap.get(A[j]);
        }

        return results;
    }
}