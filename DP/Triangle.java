package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n]; // memoization table, default initialized to 0

        // Initialize the dp array with -1 indicating uncalculated state
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(0, 0, triangle, dp);
    }

    private int helper(int row, int col, List<List<Integer>> triangle, int[][] dp) {
        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col); // Base case, last row
        }

        if (dp[row][col] != -1) {
            return dp[row][col]; // Return cached result
        }

        int left = helper(row + 1, col, triangle, dp) + triangle.get(row).get(col);
        int right = helper(row + 1, col + 1, triangle, dp) + triangle.get(row).get(col);

        return dp[row][col] = Math.min(left, right); // Cache and return the result
    }
}
