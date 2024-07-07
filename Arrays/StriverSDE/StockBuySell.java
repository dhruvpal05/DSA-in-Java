package Arrays.StriverSDE;

public class StockBuySell {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i <= prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if(prices[i] - prices[j] > profit) {
                    profit = prices[i] - prices[j];
                }
            }
        }
        return profit;
    }
}
