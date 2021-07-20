package org.table.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。
 *
 * 两个相邻元素间的距离为 1 。
 */
public class UpdateMatrix_0542 {

    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        int xl = mat.length;
        int yl = mat[0].length;
        for (int i = 0; i < xl; i++) {
            for (int j = 0; j < yl; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] = -1;
                } else {
                    int[] arr = {i, j};
                    queue.offer(arr);
                }
            }
        }
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int x = arr[0];
            int y = arr[1];
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i];
                int my = y + dy[i];
                if (mx >= 0 && mx < xl && my >= 0 && my < yl) {
                    if (mat[mx][my] == -1) {
                        mat[mx][my] = mat[x][y] + 1;
                        int[] array = {mx, my};
                        queue.offer(array);
                    }
                }
            }
        }
        return mat;
    }
}
