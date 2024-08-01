package DP;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[][] dp = new int[row][col];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }

        return helper(row - 1, col - 1, grid, dp);
    }

    private int helper(int row, int col, int[][] grid, int[][] dp) {
        if (row < 0 || col < 0) {
            return Integer.MAX_VALUE; // Out of bounds
        }
        if (row == 0 && col == 0) {
            return grid[row][col]; // Starting point
        }

        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        int top = helper(row - 1, col, grid, dp);
        int left = helper(row, col - 1, grid, dp);

        // Only add grid[row][col] if it's within bounds and not an out-of-bounds
        // indication
        if (top == Integer.MAX_VALUE && left == Integer.MAX_VALUE) {
            return dp[row][col] = grid[row][col];
        } else {
            return dp[row][col] = grid[row][col] + Math.min(top, left);
        }
    }

}
