public class BuySellStocks4 {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;
        
        // Initialize the dp array: dp[i][cap][j]
        int[][][] dp = new int[n][k + 1][2];
        
        // Initialize dp array with -1 for memoization
        for (int i = 0; i < n; i++) {
            for (int cap = 0; cap <= k; cap++) {
                dp[i][cap][0] = -1;
                dp[i][cap][1] = -1;
            }
        }
        
        return helper(0, n, prices, k, 1, dp);
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
            profit = Math.max(prices[i] + helper(i + 1, n, prices, cap - 1, 1, dp), helper(i + 1, n, prices, cap, 0, dp));
        }
        
        return dp[i][cap][j] = profit;
    }
    
}
