package Leetcode;

import java.util.*;

public class Contest {
    public static void main(String[] args) {
        int[] x = { 12, 16, 19, 19, 8, 1, 19, 13, 9 };
        int[] y = { 5, 3, 4, 6, 2 };
        System.out.println(maximumProfit(x, 3));
    }

    public static int maxSumDistinctTriplet(int[] x, int[] y) {
        int n = x.length;
        if (n < 3)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(x[i], Math.max(map.getOrDefault(x[i], 0), y[i]));
        }

        if (map.size() < 3)
            return 0;

        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort((a, b) -> b - a);

        return list.get(0) + list.get(1) + list.get(2);
    }

    public static long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        if (n == 0 || k == 0)
            return 0;

        long[] prev = new long[n];
        for (int t = 1; t <= k; t++) {
            long[] curr = new long[n];
            long maxSoFarNormal = Long.MIN_VALUE;
            long maxSoFarShort = Long.MIN_VALUE;

            for (int i = 1; i < n; i++) {
                long prevProfit = (i > 1) ? prev[i - 2] : 0;
                maxSoFarNormal = Math.max(maxSoFarNormal, prevProfit - prices[i - 1]);
                maxSoFarShort = Math.max(maxSoFarShort, prevProfit + prices[i - 1]);

                long localMax = Math.max(prices[i] + maxSoFarNormal, -prices[i] + maxSoFarShort);
                curr[i] = Math.max(curr[i - 1], localMax);
            }

            prev = curr;
        }

        return prev[n - 1];
    }

    public int findKthNumber(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ans.add(i);
        }

        ans.sort((a, b) -> {
            String s1 = String.valueOf(a);
            String s2 = String.valueOf(b);
            return s1.compareTo(s2);
        });

        return ans.get(k - 1);
    }
}
