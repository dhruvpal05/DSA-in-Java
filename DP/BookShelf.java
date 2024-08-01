package DP;

public class BookShelf {
    class Solution {
        public int minHeightShelves(int[][] books, int shelfWidth) {
            int n = books.length;
            int[] dp = new int[n + 1];

            // Initialize dp array with a large number, as we are looking for the minimum
            for (int i = 0; i <= n; i++) {
                dp[i] = Integer.MAX_VALUE;
            }

            // Base case: No books means no height needed
            dp[0] = 0;

            // Fill dp array
            for (int i = 1; i <= n; i++) {
                int currentWidth = 0;
                int maxHeight = 0;

                // Consider placing the i-th book and the previous books on the same shelf
                for (int j = i; j > 0; j--) {
                    currentWidth += books[j - 1][0];
                    if (currentWidth > shelfWidth)
                        break; // If shelf width is exceeded, break the loop
                    maxHeight = Math.max(maxHeight, books[j - 1][1]);
                    dp[i] = Math.min(dp[i], dp[j - 1] + maxHeight);
                }
            }

            return dp[n];   
        }
    }

}
