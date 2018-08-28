package com.corindiano.leetcode.p121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBestTimeToBuyStock {
    @Test
    void testDefault() {
        int[] prices = new int[]{7, 6, 5, 4, 3, 2, 1};
        assertEquals(0, BestTimeToBuyStock.maxProfit(prices));
    }

    @Test
    void testCase1() {
        int[] prices = new int[]{7, 1, 5, 4, 6, 4};
        assertEquals(5, BestTimeToBuyStock.maxProfit(prices));
    }

    @Test
    void testDefault_Better() {
        int[] prices = new int[]{7, 6, 5, 4, 3, 2, 1};
        assertEquals(0, BestTimeToBuyStock_Better.maxProfit(prices));
    }

    @Test
    void testCase1_Better() {
        int[] prices = new int[]{7, 1, 5, 4, 6, 4};
        assertEquals(5, BestTimeToBuyStock_Better.maxProfit(prices));
    }
}