package com.corindiano.leetcode.p359;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestLoggerRateLimiter {
    @Test
    void testCase1() {
        LoggerRateLimiter logger = new LoggerRateLimiter();
        assertTrue(logger.shouldPrintMessage(1, "foo"));
        assertTrue(logger.shouldPrintMessage(2, "bar"));
        assertFalse(logger.shouldPrintMessage(3, "foo"));
        assertFalse(logger.shouldPrintMessage(8, "bar"));
        assertFalse(logger.shouldPrintMessage(10, "foo"));
        assertTrue(logger.shouldPrintMessage(11, "foo"));
    }

    @Test
    void testCase2() {
        LoggerRateLimiter logger = new LoggerRateLimiter();
        assertTrue(logger.shouldPrintMessage(1, "a"));
        assertTrue(logger.shouldPrintMessage(10, "b"));
        assertFalse(logger.shouldPrintMessage(11, "b"));
    }
}