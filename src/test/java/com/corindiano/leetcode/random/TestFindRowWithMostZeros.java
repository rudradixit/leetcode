package com.corindiano.leetcode.random;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TestFindRowWithMostZeros {
    @Test
    void testCase1() {
        int[][] matrix = {
            {0},
            {1},
            {1}
        };

        assertEquals(0, FindRowWithMostZeros.find(matrix));
    }

    @Test
    void testCase2() {
        int[][] matrix = {
            {0, 1, 1},
            {0, 0, 0},
            {0, 0, 1}
        };

        assertEquals(1, FindRowWithMostZeros.find(matrix));
    }

    @Test
    void testCase3() {
        int[][] matrix = {
            {1, 1, 1},
            {0, 1, 1},
            {0, 0, 1}
        };

        assertEquals(2, FindRowWithMostZeros.find(matrix));
    }

    @Test
    void testCase4() {
        int[][] matrix = new int[100][100];

        for (int i=0; i<63; i++) {
            int numberOfZeros = 1 + new Random().nextInt(50);

            for (int j=0; j<numberOfZeros; j++) {
                matrix[i][j] = 0;
            }

            for (int k=numberOfZeros; k<100; k++) {
                matrix[i][k] = 1;
            }
        }

        for (int j=0; j<100; j++) {
            matrix[63][j] = 0;
        }

        for (int i=64; i<100; i++) {
            int numberOfZeros = 1 + new Random().nextInt(50);

            for (int j=0; j<numberOfZeros; j++) {
                matrix[i][j] = 0;
            }

            for (int k=numberOfZeros; k<100; k++) {
                matrix[i][k] = 1;
            }
        }

        assertEquals(63, FindRowWithMostZeros.find(matrix));
    }
}