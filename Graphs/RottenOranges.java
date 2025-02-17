package Graphs;

import java.util.LinkedList;
import java.util.Queue;

import pakages.literals;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int fresh=0;
        Queue<Pair> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (grid[i][j] == 2) {
                    queue.offer(new Pair(i, j, 0));
                }else if(grid[i][j] == 1){
                    fresh++;
                }
                vis[i][j] = 0;
            }
        }
        int time = 0;
        int[][] dirs = {{1, 0},{-1, 0},{0, -1},{0, 1}};
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int r = pair.row;
            int c = pair.col;
            int t = pair.time;
            time = Math.max(time, t);

            for(int i=0;i<4;i++){
                int nrow = r + dirs[i][0];
                int ncol = c + dirs[i][1];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    fresh--;
                    queue.offer(new Pair(nrow, ncol, t+1));
                    vis[nrow][ncol] = 1;
                }
            }

        }
        if (fresh>0) {
            return -1;
        }
        return time;
    }
    public class Pair {
        int row;
        int col;
        int time;
        public Pair(int row,int col,int time){
            this.row=row;
            this.time=time;
            this.col=col;
        }        
    }
}
