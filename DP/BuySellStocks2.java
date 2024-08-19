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

}
