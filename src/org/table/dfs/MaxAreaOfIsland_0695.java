package org.table.dfs;

/**
 * 给定一个包含了一些 0 和 1 的非空二维数组grid 。
 *
 * 一个岛屿是由一些相邻的1(代表土地) 构成的组合，这里的「相邻」要求两个 1 必须在水平或者竖直方向上相邻。你可以假设grid 的四个边缘都被 0（代表水）包围着。
 *
 * 找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为 0 。)
 *
 */
public class MaxAreaOfIsland_0695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j) {
        int n = 0;
        if(grid[i][j] == 1) {
            n++;
            grid[i][j] = 0;
            if(i - 1 >= 0) {
                n += dfs(grid, i - 1, j);
            }
            if(i + 1 < grid.length) {
                n += dfs(grid, i + 1, j);
            }
            if(j - 1 >= 0) {
                n += dfs(grid, i, j - 1);
            }
            if(j + 1 <  grid[0].length) {
                n += dfs(grid, i, j + 1);
            }
        }
        return n;
    }

}

