package com.corindiano.leetcode.p79;

class WordSearch {
    private static boolean _exist(char[][] board, String word, int row, int col, int idx, boolean[][] used) {
        if (idx == word.length()) return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[row].length) return false;
        if (used[row][col]) return false;
        if (board[row][col] != word.charAt(idx)) return false;

        used[row][col] = true;

        if (_exist(board, word, row-1, col, idx+1, used)) return true;
        if (_exist(board, word, row+1, col, idx+1, used)) return true;
        if (_exist(board, word, row, col-1, idx+1, used)) return true;
        if (_exist(board, word, row, col+1, idx+1, used)) return true;

        used[row][col] = false;

        return false;
    }

    static boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) return false;
        if (word == null || word.isEmpty()) return false;

        boolean[][] used = new boolean[board.length][];
        int count = 0;
        for (int i=0; i<board.length; i++) {
            used[i] = new boolean[board[i].length];
            count += board[i].length;
        }

        if (word.length() > count) return false;

        for (int r=0; r<board.length; r++)
            for (int c=0; c<board[r].length; c++)
                if (_exist(board, word, r, c, 0, used)) return true;

        return false;
    }
}