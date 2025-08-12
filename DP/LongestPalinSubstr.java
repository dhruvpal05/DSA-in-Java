package DP;

public class LongestPalinSubstr {
    public boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome1(String s) {
        int n = s.length();
        int max = Integer.MIN_VALUE;
        int start = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j)) {
                    if ((j - i + 1) > max) {
                        max = j - i + 1;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + max);
    }

    public String longestPalindrome(String s) {
        int ans = 1;
        int start = 0;
        int end = 0;

        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; i < n; j++) {
                if (isPalindrome(s, i, j) && s.substring(i, j + 1).length() > ans) {
                    ans = s.substring(i, j + 1).length();
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }
}
