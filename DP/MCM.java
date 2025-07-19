package DP;

import java.util.*;

public class MCM {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(matrixMultiplication(nums));
    }

    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return helper(1, n - 1, arr, dp);
    }

    private static int helper(int i, int j, int[] arr, int[][] dp) {
        if (i == j)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int ans = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int cost = arr[i - 1] * arr[k] * arr[j]
                    + helper(i, k, arr, dp)
                    + helper(k + 1, j, arr, dp);
            ans = Math.min(ans, cost);
        }

        return dp[i][j] = ans;
    }

}
