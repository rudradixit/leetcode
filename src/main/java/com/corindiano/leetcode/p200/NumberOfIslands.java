package com.corindiano.leetcode.p200;

class NumberOfIslands {
    private static void _countIslands(char[][] grid, int r, int c, boolean[][] used) {
        if (r < 0 || r >= grid.length) return;
        if (c < 0 || c >= grid[r].length) return;
        if (used[r][c]) return;
        if (grid[r][c] == '0') return;

        used[r][c] = true;

        if (r > 0) _countIslands(grid, r-1, c, used);
        if (r < grid.length - 1) _countIslands(grid, r+1, c, used);
        if (c > 0) _countIslands(grid, r, c-1, used);
        if (c < grid[r].length - 1) _countIslands(grid, r, c+1, used);
    }

    static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        boolean[][] used = new boolean[grid.length][grid[0].length];
        int islands = 0;

        for (int i=0; i<grid.length; i++)
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == '1' && !used[i][j]) {
                    _countIslands(grid, i, j, used);
                    ++islands;
                }
            }

        return islands;
    }
}