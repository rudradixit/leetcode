package com.corindiano.leetcode.random.heaps;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestComputeKClosestStars {
    @Test
    void testCase1() {
        ComputeKClosestStars.Star s1 = new ComputeKClosestStars.Star(6, 3, 5);
        ComputeKClosestStars.Star s2 = new ComputeKClosestStars.Star(7, 4, 3);

        List<ComputeKClosestStars.Star> stars = new ArrayList<>();
        stars.add(new ComputeKClosestStars.Star(9, 8, 7)); // 194
        stars.add(s1); // 70
        stars.add(new ComputeKClosestStars.Star(2, 5, 9)); // 110
        stars.add(s2); // 74
        stars.add(new ComputeKClosestStars.Star(9, 9, 1)); // 163

        List<ComputeKClosestStars.Star> results = ComputeKClosestStars.findClosestKStars(2, stars.iterator());
        assertNotNull(results);
        assertEquals(2, results.size());
        assertTrue(results.contains(s1));
        assertTrue(results.contains(s2));
    }
}