package com.corindiano.leetcode.p811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SubdomainVisitCount {
    private static void addToMap(Map<String, Integer> map, String domain, int hits) {
        if (!map.containsKey(domain)) {
            map.put(domain, hits);
        } else {
            int current = map.get(domain);
            map.put(domain, current + hits);
        }
    }

    static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> hitsMap = new HashMap<>();

        for (String cpd : cpdomains) {
            String[] splits = cpd.split(" ");

            if (splits.length == 2) {
                int hits = Integer.parseInt(splits[0]);
                String domain = splits[1];

                while (domain.contains(".")) {
                    addToMap(hitsMap, domain, hits);
                    domain = domain.substring(domain.indexOf(".") + 1);
                }

                addToMap(hitsMap, domain, hits);
            }
        }

        List<String> results = new ArrayList<>();

        for (String key : hitsMap.keySet()) {
            results.add(hitsMap.get(key) + " " + key);
        }

        return results;
    }
}