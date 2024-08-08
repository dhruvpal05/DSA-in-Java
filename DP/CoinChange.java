package DP;

import java.util.Arrays;

public class CoinChange {
    // coin change 2 code studio
    public static long countWaysToMakeChange(int denominations[], int value){
        int n = denominations.length;
        long[][] dp = new long[n][value+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i],-1);
        }
        return helper2(n,denominations,value,dp);
	}

    private static long helper2(int n, int[] denominations, int value, long[][] dp) {
        if (n == 0) {
            if (value%denominations[0] == 0) {
                return 1;
            }else{
                return 0;
            }
        }
        if (dp[n][value]!=-1) {
            return dp[n][value];
        }

        long nottake = helper2(n-1, denominations, value,dp);
        long take = 0;
        if (denominations[n]<=value) {
            take = helper2(n, denominations, value-denominations[n],dp);
        }
        return dp[n][value] = take+nottake;
    }

    // leetcode 
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(n-1,coins,amount, dp);
    }

    private int helper(int i, int[] coins, int amount, int[][] dp) {
        if (i == 0) {
            if (amount%coins[0] == 0) {
                return 1;
            }else{
                return 0;
            }
        }
        if (dp[i][amount]!=-1) {
            return dp[i][amount];
        }

        int notpick = helper(i-1, coins, amount,dp);
        int pick = 0;
        if (coins[i]<=amount) {
            pick = helper(pick, coins, amount-coins[i],dp);
        }

        return dp[i][amount] = pick+notpick;
    }
}
