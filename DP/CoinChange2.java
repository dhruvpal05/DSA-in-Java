package DP;

import java.util.Arrays;

public class CoinChange2 {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(n - 1, amount, coins, dp);
    }

    private int helper(int i, int amount, int[] coins, int[][] dp) {
        if (i == 0) {
            if (amount % coins[0] == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }

        int notpick = helper(i - 1, amount, coins, dp);
        int pick = 0;
        if (coins[i] <= amount) {
            pick = helper(i, amount - coins[i], coins, dp);
        }

        return dp[i][amount] = pick + notpick;
    }
}
