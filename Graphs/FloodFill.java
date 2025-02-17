package Graphs;

import java.util.LinkedList;
import java.util.Queue;

import Graphs.RottenOranges.Pair;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color == 0) {
            return image;
        }
        int n = image.length;
        int m = image[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int[][] vis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                vis[i][j] = 0;
            }
        }
        queue.offer(new Pair(sr, sc));
        image[sr][sc] = color;
        vis[sr][sc] = 1;
        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int r = pair.row;
            int c = pair.col;
            for (int i = 0; i < 4; i++) {
                int nrow = r + dir[i][0];
                int ncol = c + dir[i][1];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] != 0 && vis[nrow][ncol] != 1) {
                    queue.offer(new Pair(nrow, ncol));
                    vis[nrow][ncol] = 1;
                    image[nrow][ncol] = color;
                }
            }
        }
        return image;
    }

    public class Pair {
        int row, col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
