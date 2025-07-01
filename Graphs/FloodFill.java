package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int start = image[sr][sc];
        if (start == color) {
            return image;
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(sr, sc));
        image[sr][sc] = color;

        int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

        while (!queue.isEmpty()) {
            Pair node = queue.poll();
            for (int[] dir : dirs) {
                int row = node.row + dir[0];
                int col = node.col + dir[1];
                if (row >= 0 && row < n && col >= 0 && col < m && image[row][col] == start
                        && image[row][col] != color) {
                    queue.offer(new Pair(row, col));
                    image[row][col] = color;
                }
            }
        }

        return image;
    }

    public class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
