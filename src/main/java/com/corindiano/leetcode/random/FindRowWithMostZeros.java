package com.corindiano.leetcode.random;

class FindRowWithMostZeros {
    private static int binSearch(int[] row, int start, int end) {
        if (row[start] == 1) return 0;
        if (row[end] == 0) return end-start+1;

        int mid = (end+start) / 2;

        if (row[mid] == 1 && row[mid-1] == 0) return mid-1-start+1;
        if (row[mid] == 0 && row[mid+1] == 1) return mid-start+1;

        if (row[mid] == 1) return binSearch(row, start, mid-1);
        else return binSearch(row, mid+1, end);
    }

    private static int getNumberOfZeros(int[] row) {
        return binSearch(row, 0, row.length-1);
    }

    static int find(int[][] matrix) {
        int chosen = -1;
        int max = Integer.MIN_VALUE;

        for (int r=0; r<matrix.length; r++) {
            int[] row = matrix[r];

            int numOfZeros = getNumberOfZeros(row);

            if (max < numOfZeros) {
                max = numOfZeros;
                chosen = r;
            }
        }

        return chosen;
    }
}