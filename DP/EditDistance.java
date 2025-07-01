package DP;

import java.util.Arrays;

public class EditDistance {
    private int helper(int i, int j, String word1, String word2, int[][] dp) {
        if (i == 0)
            return j;
        if (j == 0)
            return i;
        if (dp[i][j] != -1)
            return dp[i][j];

        if (word1.charAt(i - 1) == word2.charAt(j - 1))
            return dp[i][j] = helper(i - 1, j - 1, word1, word2, dp);
        return dp[i][j] = 1 + Math.min(helper(i, j - 1, word1, word2, dp),
                Math.min(helper(i - 1, j, word1, word2, dp), helper(i - 1, j - 1, word1, word2, dp)));
    }

    public int minDistance1(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return helper(n, m, word1, word2, dp);
    }

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper1(n - 1, m - 1, word1, word2, dp);
    }

    public int editDistance(String s1, String s2) {
        // Code here
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper1(n - 1, m - 1, s1, s2, dp);
    }

    private int helper1(int i, int j, String word1, String word2, int[][] dp) {
        if (i < 0) {
            return i + 1;
        }
        if (j < 0) {
            return j + 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (word1.charAt(i) == word2.charAt(j)) {
            return dp[i][j] = helper1(i - 1, j - 1, word1, word2, dp);
        }

        return dp[i][j] = 1 + Math.min(helper1(i - 1, j, word1, word2, dp),
                Math.min(helper1(i, j - 1, word1, word2, dp), helper1(i - 1, j - 1, word1, word2, dp)));
    }
}
