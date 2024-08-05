package DP;

import java.util.Arrays;

public class Knapsack01 {

    // naive recursive approach
    static int knapSack1(int N, int W, int val[], int wt[]) {
        return helper1(N - 1, W, val, wt);
    }

    private static int helper1(int i, int w, int[] val, int[] wt) {
        if (w == 0) {
            return 0;
        }
        if (i == 0) {
            return wt[0] <= w ? val[0] : 0;
        }

        int notpick = helper1(i - 1, w, val, wt);
        int pick = Integer.MIN_VALUE;
        if (wt[i] <= w) {
            pick = helper1(i - 1, w - wt[i], val, wt) + val[i];
        }

        return Math.max(notpick, pick);
    }

    // using dp
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int[][] dp = new int[n][maxWeight + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(n - 1, maxWeight, value, weight, dp);
    }

    private static int helper(int i, int w, int[] val, int[] wt, int[][] dp) {
        if (w == 0) {
            return 0;
        }
        if (i == 0) {
            return wt[0] <= w ? val[0] : 0;
        }
        if (dp[i][w] != -1) {
            return dp[i][w];
        }

        int notpick = helper(i - 1, w, val, wt, dp);
        int pick = Integer.MIN_VALUE;
        if (wt[i] <= w) {
            pick = helper(i - 1, w - wt[i], val, wt, dp) + val[i];
        }

        return dp[i][w] = Math.max(notpick, pick);
    }
}
