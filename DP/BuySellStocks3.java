public class BuySellStocks3 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][3][2]; // 3D DP array, initialized to 0 by default

        // Initialize dp array with -1 for memoization
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j][0] = -1;
                dp[i][j][1] = -1;
            }
        }

        return helper(0, n, prices, 2, 1, dp);
    }

    private int helper(int i, int n, int[] prices, int cap, int j, int[][][] dp) {
        if (cap == 0 || i == n) {
            return 0;
        }
        if (dp[i][cap][j] != -1) {
            return dp[i][cap][j];
        }
        int profit = 0;
        if (j == 1) { // Buy
            profit = Math.max(-prices[i] + helper(i + 1, n, prices, cap, 0, dp), helper(i + 1, n, prices, cap, 1, dp));
        } else { // Sell
            profit = Math.max(prices[i] + helper(i + 1, n, prices, cap - 1, 1, dp),
                    helper(i + 1, n, prices, cap, 0, dp));
        }
        return dp[i][cap][j] = profit;
    }

}
