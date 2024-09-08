package DP;

public class WildcardMatch {
    public boolean isMatch1(String s, String p) {
        int n = s.length();
        int m = p.length();

        return helper(n - 1, m - 1, s, p);
    }

    private boolean helper(int n, int m, String s, String p) {
        // Both strings are exhausted
        if (n < 0 && m < 0) {
            return true;
        }

        // Pattern is exhausted but string is not
        if (n >= 0 && m < 0) {
            return false;
        }

        // String is exhausted but pattern is not
        if (n < 0 && m >= 0) {
            // Check if the remaining pattern characters are all '*'
            for (int i = m; i >= 0; i--) {
                if (p.charAt(i) != '*') {
                    return false;
                }
            }
            return true;
        }

        // Matching characters or '?' wildcard
        if (s.charAt(n) == p.charAt(m) || p.charAt(m) == '?') {
            return helper(n - 1, m - 1, s, p);
        }

        // '*' wildcard can match any sequence
        if (p.charAt(m) == '*') {
            // Two possibilities:
            // 1. Match '*' with no characters from s (move pattern pointer)
            // 2. Match '*' with at least one character from s (move string pointer)
            return helper(n - 1, m, s, p) || helper(n, m - 1, s, p);
        }

        // No match
        return false;
    }

    // memoization

    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        Boolean[][] dp = new Boolean[n + 1][m + 1]; // Use Boolean for null-check, and size n+1 and m+1

        return helper(n, m, s, p, dp);
    }

    private boolean helper(int n, int m, String s, String p, Boolean[][] dp) {
        // Base cases
        if (n == 0 && m == 0) {
            return true;
        }

        if (n > 0 && m == 0) {
            return false;
        }

        if (n == 0 && m > 0) {
            // Check if remaining pattern is all '*'
            for (int i = 1; i <= m; i++) {
                if (p.charAt(i - 1) != '*') {
                    return false;
                }
            }
            return true;
        }

        // Check if solution is already computed
        if (dp[n][m] != null) {
            return dp[n][m];
        }

        // Matching characters or '?'
        if (s.charAt(n - 1) == p.charAt(m - 1) || p.charAt(m - 1) == '?') {
            dp[n][m] = helper(n - 1, m - 1, s, p, dp);
        } 
        // '*' matches zero or more characters
        else if (p.charAt(m - 1) == '*') {
            dp[n][m] = helper(n - 1, m, s, p, dp) || helper(n, m - 1, s, p, dp);
        } 
        // No match
        else {
            dp[n][m] = false;
        }

        return dp[n][m];
    }
}
