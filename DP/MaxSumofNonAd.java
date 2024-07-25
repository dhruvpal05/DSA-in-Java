package DP;

import java.util.ArrayList;

public class MaxSumofNonAd {
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        int n = nums.size();
        int[] memo = new int[n];
        for (int j = 0; j < n; j++) {
            memo[j] = -1;
        }
        return helper(nums, n - 1, memo);
    }

    private static int helper(ArrayList<Integer> nums, int i, int[] memo) {
        if (i == 0) {
            return nums.get(i);
        }
        if (i < 0) {
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        int pick = helper(nums, i - 2, memo) + nums.get(i);
        int notpick = helper(nums, i - 1, memo);

        memo[i] = Math.max(pick, notpick);
        return memo[i];
    }
}
