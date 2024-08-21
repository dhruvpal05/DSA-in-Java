import java.util.Arrays;

public class BuySellStocks5 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(0, prices, 1, dp);
    }

    private static int helper(int n, int[] prices, int i, int[][] dp) {
        if (n >= prices.length) {
            return 0;
        }
        if (dp[n][i] != -1) {
            return dp[n][i];
        }

        int profit;
        if (i == 1) {
            // Buying scenario: either buy or skip
            profit = Math.max(-prices[n] + helper(n + 1, prices, 0, dp), helper(n + 1, prices, 1, dp));
        } else {
            // Selling scenario: either sell or skip (move to n + 2 for selling)
            profit = Math.max(prices[n] + helper(n + 2, prices, 1, dp), helper(n + 1, prices, 0, dp));
        }

        return dp[n][i] = profit;
    }
}
