package DP;

public class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        if (n == 0) {
            ans[n] = 0;
            return ans;
        }
        if (n == 1) {
            ans[n] = 1;
            return ans;
        }

        return countBits(n-1);
    }

}
