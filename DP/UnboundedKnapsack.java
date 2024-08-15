package DP;

import java.util.Arrays;

public class UnboundedKnapsack {
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        int[][] dp = new int[n][w+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(n-1,w,profit,weight,dp);
    }

    private static int helper(int n, int w, int[] profit, int[] weight, int[][] dp) {
        if (n == 0) {
            return (w/weight[0])*profit[0];
        }

        if (dp[n][w] != -1) {
            return dp[n][w];
        }

        int nottake = helper(n-1, w, profit, weight,dp);
        int take = Integer.MIN_VALUE;
        if (weight[n]<=w) {
            take = helper(n, w-weight[n], profit, weight,dp);
        }

        dp[n][w] = Math.max(take,nottake);

        return dp[n][w];
    }
}
