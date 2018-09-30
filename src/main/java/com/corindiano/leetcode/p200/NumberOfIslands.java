package com.corindiano.leetcode.p200;

class NumberOfIslands {
    static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int islands = 0;

        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == '0') continue;

                int landSpots = 0;
                // check top
                if (i > 0) landSpots += (grid[i-1][j] == '1' ? 1 : 0);
                // check bottom
                if (i < grid.length - 1) landSpots += (grid[i+1][j] == '1' ? 1 : 0);
                // check left
                if (j > 0) landSpots += (grid[i][j-1] == '1' ? 1 : 0);
                // check right
                if (j < grid[i].length - 1) landSpots += (grid[i][j+1] == '1' ? 1 : 0);

                if (landSpots == 1) {
                    islands++;
                }
            }
        }

        return islands;
    }
}