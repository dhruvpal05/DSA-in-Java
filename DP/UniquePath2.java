package DP;

import java.util.Arrays;

public class UniquePath2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        int[][] dp = new int[row][col];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                dp[i][j] = -1;
            }
        }

        return helper(row, col, obstacleGrid, dp);
    }

    private int helper(int row, int col, int[][] obstacleGrid, int[][] dp) {
        if (row == 0 && col == 0) {
            return 1;
        }
        if (row < 0 || col < 0) {
            return 0;
        }
        if (row > 0 && col > 0) {
            if (obstacleGrid[row][col] == 1) {
                return 0;
            }
        }

        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        int top = helper(row - 1, col, obstacleGrid, dp);
        int left = helper(row, col - 1, obstacleGrid, dp);

        return dp[row][col] = top + left;
    }
}
