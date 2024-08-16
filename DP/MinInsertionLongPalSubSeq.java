package DP;

public class MinInsertionLongPalSubSeq {
    public int minInsertions(String s) {
        return s.length() - longestPalindromeSubseq(s);
    }

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
