package com.corindiano.leetcode.p200;

class NumberOfIslands {
    private static void _countIslands(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length) return;
        if (c < 0 || c >= grid[r].length) return;
        if (grid[r][c] != '1') return;

        grid[r][c] = '*';

        _countIslands(grid, r-1, c);
        _countIslands(grid, r+1, c);
        _countIslands(grid, r, c-1);
        _countIslands(grid, r, c+1);
    }

    static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int islands = 0;

        for (int i=0; i<grid.length; i++)
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    _countIslands(grid, i, j);
                    ++islands;
                }
            }

        return islands;
    }
}