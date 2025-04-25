package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NoOfIsland {

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    ans++;
                    bfs(i, j, vis, grid);
                }
            }
        }
        return ans;
    }

    private void bfs(int i, int j, boolean[][] vis, char[][] grid) {
        vis[i][j] = true;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(i, j));
        int n = grid.length;
        int m = grid[0].length;

        while (!queue.isEmpty()) {
            int row = queue.peek().row;
            int col = queue.peek().col;
            queue.poll();

            // 4-directional traversal (up, down, left, right)
            int[] drow = { -1, 0, 1, 0 };
            int[] dcol = { 0, 1, 0, -1 };

            for (int k = 0; k < 4; k++) {
                int nrow = row + drow[k];
                int ncol = col + dcol[k];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                        !vis[nrow][ncol] && grid[nrow][ncol] == '1') {
                    vis[nrow][ncol] = true;
                    queue.offer(new Pair(nrow, ncol));
                }
            }
        }
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
