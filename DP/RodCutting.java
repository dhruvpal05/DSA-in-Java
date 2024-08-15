package DP;

import java.util.Arrays;

public class RodCutting {
    public static int cutRod(int price[], int n) {
        int[][] dp = new int[n][n+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(n-1,n, price,dp);
	}

    private static int helper(int n,int N, int[] price, int[][] dp) {
        if (n == 0) {
            return N*price[0];
        }
        if (dp[n][N] != -1) {
            return dp[n][N];
        }

        int nottake = 0 + helper(n-1,N, price,dp);
        int take =Integer.MIN_VALUE;
        int rodlength = n +1; 
        if (rodlength <= N) {
            take = price[n] + helper(n, N - rodlength, price,dp);
        }

        return dp[n][N] = Math.max(nottake,take);
    }
}
