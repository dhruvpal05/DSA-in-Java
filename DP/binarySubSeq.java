package DP;

import java.util.*;;
// import sun.tools.jar.resources.jar;

public class binarySubSeq {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(0, -1, nums, dp);
    }

    public int helper(int i, int prev, int[] nums, int[][] dp) {
        if (i == nums.length)
            return 0;
        if (dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }
        int nottake = 0 + helper(i + 1, prev, nums, dp);
        if (prev == -1 || nums[i] > nums[prev]) {
            int take = 1 + helper(i + 1, i, nums, dp);
            nottake = Math.max(nottake, take);
        }

        return dp[i][prev + 1] = nottake;
    }

    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currMax = 1;
            for (int j = i; j < n; j++) {
                currMax *= nums[j];
                max = Math.max(max, currMax);
            }
        }
        return max;
    }

    // 0,3,[2,3,-2,4]
    private int helper(int i, int n, int[] nums) {
        if (i==n) {
            return nums[i];
        }
        int take = helper(i+1, n, nums) + nums[i];
        int nottake = helper(i+1, n, nums);
        return Math.max(take, nottake);
    }
}
