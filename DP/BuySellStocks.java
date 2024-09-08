package DP;

public class BuySellStocks {
    // public int maxProfit(int[] prices) {
    // int min = prices[0], profit = 0;

    // for (int i = 1; i < prices.length; i++) {
    // int cost = prices[i] - min;
    // profit = Math.max(profit,cost);
    // min = Math.min(min,prices[i]);
    // }

    // return profit;
    // }

    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int max = prices[j] - prices[i];
                profit = Math.max(max,profit);
            }
        }
        if (profit < 0) {
            return 0;
        }else{
            return profit;
        }
    }
}
