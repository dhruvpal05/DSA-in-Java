package Recursion;

import java.util.ArrayList;

public class RantInMaze {
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> result = new ArrayList<>();
        int n = maze.length;
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
            return result;
        boolean[][] visited = new boolean[n][n];
        solve(0, 0, maze, n, "", visited, result);
        return result;
    }

    private void solve(int i, int j, int[][] maze, int n, String path,
            boolean[][] visited, ArrayList<String> result) {
        if (i == n - 1 && j == n - 1) {
            result.add(path);
            return;
        }

        visited[i][j] = true;
        
        int[] di = { 1, 0, 0, -1 };
        int[] dj = { 0, -1, 1, 0 };
        char[] dir = { 'D', 'L', 'R', 'U' };

        for (int idx = 0; idx < 4; idx++) {
            int ni = i + di[idx];
            int nj = j + dj[idx];

            if (ni >= 0 && nj >= 0 && ni < n && nj < n &&
                    !visited[ni][nj] && maze[ni][nj] == 1) {
                solve(ni, nj, maze, n, path + dir[idx], visited, result);
            }
        }

        visited[i][j] = false;
    }
}
