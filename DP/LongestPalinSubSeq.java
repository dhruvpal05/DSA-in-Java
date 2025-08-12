package DP;

import java.util.Arrays;

public class LongestPalinSubSeq {
    public int longestPalindromeSubseq1(String s) {
        int n = s.length();
        String str = new StringBuilder(s).reverse().toString();
        int[][] dp = new int[n+1][n+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(n-1,n-1,s,str, dp);
    }

    private static int helper(int i, int j, String s, String t, int[][] dp) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = 1 + helper(i-1, j-1, s, t,dp);
        }

        return dp[i][j] = Math.max(helper(i-1, j, s, t,dp),helper(i, j-1, s, t,dp));
    }

    // tabulation
    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        int n = s.length();
        int[][] dp = new int[m + 1][n + 1];
        String rev = new StringBuilder(s).reverse().toString();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

}
