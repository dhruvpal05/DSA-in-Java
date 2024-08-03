package DP;

import java.util.Arrays;

public class CherryPick {

    class Solution {
        public int cherryPickup(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int[][][] dp = new int[n][m][m];

            for (int[][] row1 : dp) {
                for (int[] row2 : row1) {
                    Arrays.fill(row2, -1);
                }
            }

            return helper(0, 0, m - 1, n, m, grid, dp);
        }

        private int helper(int i, int j1, int j2, int n, int m, int[][] grid, int[][][] dp) {
            if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m) {
                return Integer.MIN_VALUE;
            }

            if (i == n - 1) {
                if (j1 == j2) {
                    return grid[i][j1];
                } else {
                    return grid[i][j1] + grid[i][j2];
                }
            }

            if (dp[i][j1][j2] != -1) {
                return dp[i][j1][j2];
            }

            int maxCherries = Integer.MIN_VALUE;

            for (int move1 = -1; move1 <= 1; move1++) {
                for (int move2 = -1; move2 <= 1; move2++) {
                    int newj1 = j1 + move1;
                    int newj2 = j2 + move2;

                    int value;
                    if (j1 == j2) {
                        value = grid[i][j1] + helper(i + 1, newj1, newj2, n, m, grid, dp);
                    } else {
                        value = grid[i][j1] + grid[i][j2] + helper(i + 1, newj1, newj2, n, m, grid, dp);
                    }

                    maxCherries = Math.max(maxCherries, value);
                }
            }

            dp[i][j1][j2] = maxCherries;
            return maxCherries;
        }
    }

}
