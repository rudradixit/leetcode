package com.corindiano.leetcode.p359;

import java.util.HashMap;
import java.util.Map;

class LoggerRateLimiter {
    private Map<String, Integer> msgCache = new HashMap<>();

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!msgCache.containsKey(message)) {
            msgCache.put(message, timestamp + 10 - 1);
            return true;
        }

        if (timestamp <= msgCache.get(message)) return false;

        msgCache.put(message, timestamp + 10 - 1);
        return true;
    }
}