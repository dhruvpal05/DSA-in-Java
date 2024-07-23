package DP;

import java.util.Arrays;

public class Stairs {
    public int climbStairs2(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Approach - 1
    class Solution {
        public int climbStairs(int n) {

            int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);
            dp[0] = 0;
            dp[1] = 1;

            return helper(n, dp);

        }

        int helper(int n, int[] dp) {

            if (n == 0)
                return 1;
            if (n < 1)
                return 0;

            if (dp[n] != -1)
                return dp[n];

            return dp[n] = helper(n - 1, dp) + helper(n - 2, dp);

        }
    }

    // Approach - 2
    class Solution2 {
        public int climbStairs(int n) {

            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) { // Corrected loop condition
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }

    // Approach - 3
    class Solution3 {
        public int climbStairs(int n) {

            // int[] dp = new int[n + 1];
            int prev1 = 1;
            int prev2 = 1;

            for (int i = 2; i <= n; i++) { // Corrected loop condition
                int cur = prev1 + prev2;
                prev2 = prev1;
                prev1 = cur;
            }
            return prev1;
        }
    }
}
