package com.corindiano.leetcode.random.heaps;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestComputeMedianStreamingData {
    @Test
    void testCase1() {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(0);
        input.add(3);
        input.add(5);
        input.add(2);
        input.add(0);
        input.add(1);
        assertEquals(1, ComputeMedianStreamingData.compute(input.iterator()));
    }

    @Test
    void testCase2() {
        List<Integer> input = new ArrayList<>();
        input.add(0);
        input.add(9);
        input.add(1);
        input.add(8);
        input.add(2);
        input.add(7);
        input.add(3);
        input.add(6);
        input.add(4);
        input.add(5);
        assertEquals(4.5, ComputeMedianStreamingData.compute(input.iterator()));
    }
}