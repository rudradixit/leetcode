package com.corindiano.leetcode.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The N Queen is the problem of placing N chess queens on an N×N chessboard
 * so that no two queens attack each other. For example, following is a
 * solution for 4 Queen problem.
 *
 * |   | Q |   |   |
 * |   |   |   | Q |
 * | Q |   |   |   |
 * |   |   | Q |   |
 *
 *
 */
class NQueens {
    private static final List<Integer[][]> EMPTY = Collections.unmodifiableList(new ArrayList<>(0));

    List<Integer[][]> solveFor(int q, int n) {
        List<Integer[][]> results = new ArrayList<>();
        Integer[][] board;

        for (int r=0; r<n; r++)
            for (int c=0; c<n; c++) {
                board = newBoard(n);

                if (_solveFor(q, n, board, r, c)) {
                    results.add(board);
                }
            }

        return results;
    }

    private Integer[][] newBoard(int n) {
        Integer[][] array = new Integer[n][n];
        for (int r=0; r<n; r++)
            for (int c=0; c<n; c++)
                array[r][c] = 0;

        return array;
    }

    private boolean _solveFor(int q, int n, Integer[][] board, int r, int c) {
        if (q == 0) return true;
        if (r >= n || c >= n) return false;

        int nC = nextCol(c, n);
        int nR = nextRow(r, nC);

        if (isSafe(board, r, c)) {
            board[r][c] = 1;
            printBoard(board);
            return _solveFor(q - 1, n, board, nR, nC);
        }

        return _solveFor(q, n, board, nR, nC);
    }

    private void printBoard(Integer[][] board) {
        System.out.println();

        for (Integer[] row : board) {
            for (Integer cell : row)
                System.out.printf("  %d  ", cell);
            System.out.println();
        }
    }

    private int nextCol(int c, int n) {
        return (c == n - 1) ? 0 : c + 1;
    }

    private int nextRow(int r, int c) {
        return (c == 0) ? r + 1 : r;
    }

    private boolean isSafe(Integer[][] board, int row, int col) {
        // Check for other 1s in row r
        for (int c=0; c<board[row].length; c++)
            if (c != col && board[row][c] == 1) return false;

        // Check for other 1s in column c
        for (int r=0; r<board.length; r++)
            if (r != row && board[r][col] == 1) return false;

        // Check for other 1s in diagonals for (r,c)
        for (int r=row + 1, c=col + 1; r<board.length && c<board.length; r++, c++)
            if (board[r][c] == 1) return false;

        for (int r=row + 1, c=col - 1; r<board.length && c>=0; r++, c--)
            if (board[r][c] == 1) return false;

        for (int r=row - 1, c=col + 1; r>=0 && c<board.length; r--, c++)
            if (board[r][c] == 1) return false;

        for (int r=row - 1, c=col - 1; r>=0 && c>=0; r--, c--)
            if (board[r][c] == 1) return false;

        return true;
    }
}