package com.corindiano.leetcode.p750;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a grid where each entry is only 0 or 1, find the number of corner rectangles.
 *
 * A corner rectangle is 4 distinct 1s on the grid that form an axis-aligned rectangle.
 * Note that only the corners need to have the value 1. Also, all four 1s used must be distinct.
 *
 *
 *
 * Example 1:
 *
 * Input: grid =
 * [[1, 0, 0, 1, 0],
 *  [0, 0, 1, 0, 1],
 *  [0, 0, 0, 1, 0],
 *  [1, 0, 1, 0, 1]]
 * Output: 1
 * Explanation: There is only one corner rectangle, with corners grid[1][2], grid[1][4], grid[3][2], grid[3][4].
 *
 *
 * Example 2:
 *
 * Input: grid =
 * [[1, 1, 1],
 *  [1, 1, 1],
 *  [1, 1, 1]]
 * Output: 9
 * Explanation: There are four 2x2 rectangles, four 2x3 and 3x2 rectangles, and one 3x3 rectangle.
 *
 *
 * Example 3:
 *
 * Input: grid =
 * [[1, 1, 1, 1]]
 * Output: 0
 * Explanation: Rectangles must have four distinct corners.
 *
 *
 * Note:
 *
 * The number of rows and columns of grid will each be in the range [1, 200].
 * Each grid[i][j] will be either 0 or 1.
 * The number of 1s in the grid will be at most 6000.
 */
class CornerRectangles {
    private List<Integer> getOnesOnRow(int[][] grid, int row, int col) {
        List<Integer> list = new ArrayList<>();

        for (int c=col; c<grid[row].length; c++) {
            if (grid[row][c] == 1) {
                list.add(c);
            }
        }

        return list;
    }

    private List<Integer> getOnesOnCol(int[][] grid, int row, int col) {
        List<Integer> list = new ArrayList<>();

        for (int r=row; r<grid.length; r++) {
            if (grid[r][col] == 1) {
                list.add(r);
            }
        }

        return list;
    }

    int countCornerRectangles(int[][] grid) {
        if (grid == null) throw new IllegalArgumentException("Invalid grid!");
        if (grid.length <= 1) return 0;

        int maxRow = grid.length - 2;
        int maxCol = grid[0].length - 2;
        List<Integer> onePosH, onePosV;
        int count = 0;

        for (int r=0; r<=maxRow; r++) {
            for (int c=0; c<=maxCol; c++) {
                if (grid[r][c] != 1) continue;

                onePosH = getOnesOnRow(grid, r, c+1);

                if (onePosH.isEmpty()) continue;

                for (int pH : onePosH) {
                    onePosV = getOnesOnCol(grid, r+1, pH);

                    for (int pV : onePosV) {
                        if (grid[pV][c] == 1) {
                            ++count;
                        }
                    }
                }
            }
        }

        return count;
    }
}