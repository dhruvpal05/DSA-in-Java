import java.util.Arrays;

public class BuySellStocks2 {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int profit = 0;
        int maxprofit = 0;

        for (int i = 1; i < prices.length; i++) {
            profit = 0;

            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
                buy = prices[i];

            }
            maxprofit += profit;
        }
        return maxprofit;
    }
    // memoization code
    class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int[][] dp = new int[n][2];
            for (int i = 0; i < dp.length; i++) {
                Arrays.fill(dp[i], -1);
            }
            return helper(0, n, prices, 1, dp);
        }

        private static int helper(int n, int n2, int[] values, int i, int[][] dp) {
            if (n == n2) {
                return 0;
            }
            if (dp[n][i] != -1) {
                return dp[n][i];
            }

            int profit = 0;
            if (i == 1) {
                profit = Math.max(-values[n] + helper(n + 1, n2, values, 0, dp), helper(n + 1, n2, values, 1, dp));
            } else {
                profit = Math.max(values[n] + helper(n + 1, n2, values, 1, dp), helper(n + 1, n2, values, 0, dp));
            }

            return dp[n][i] = profit;
        }
    }

    public static long getMaximumProfit(int n, long[] values) {
        long[][] dp = new long[n][2];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(0, n, values, 1, dp);
    }

    private static long helper(int n, int n2, long[] values, int i, long[][] dp) {
        if (n == n2) {
            return 0;
        }
        if (dp[n][i] != -1) {
            return dp[n][i];
        }

        long profit = 0;
        if (i == 1) {
            profit = Math.max(-values[n] + helper(n + 1, n2, values, 0, dp), helper(n + 1, n2, values, 1, dp));
        } else {
            profit = Math.max(values[n] + helper(n + 1, n2, values, 1, dp), helper(n + 1, n2, values, 0, dp));
        }

        return dp[n][i] = profit;
    }

}
