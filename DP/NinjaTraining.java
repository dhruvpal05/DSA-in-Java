package DP;

public class NinjaTraining {
    public static int ninjaTraining(int n, int points[][]) {
        int last = 3; // Indicator that there's no restriction on the first day
        int[][] dp = new int[n][4]; // Adjust the size of dp array to n days and 4 possible last activities (0, 1,
                                    // 2, 3)

        // Initialize the dp array with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][j] = -1;
            }
        }

        return helper(n - 1, points, last, dp);
    }

    private static int helper(int n, int[][] points, int last, int[][] dp) {
        if (n == 0) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i <= 2; i++) {
                if (i != last) {
                    max = Math.max(points[0][i], max);
                }
            }
            return max;
        }

        if (dp[n][last] != -1) {
            return dp[n][last];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= 2; i++) {
            if (i != last) {
                max = Math.max(max, points[n][i] + helper(n - 1, points, i, dp));
            }
        }

        return dp[n][last] = max;
    }
}
