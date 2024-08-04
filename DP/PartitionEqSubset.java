package DP;

import java.util.Arrays;

public class PartitionEqSubset {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum+=num;
        }
        if (sum%2 != 0) {
            return false;
        }
        Boolean[][] dp = new Boolean[n][sum+1];
        for (Boolean[] row : dp) {
            Arrays.fill(row, null);
        }
        return helper(n-1,nums,sum/2,dp);
    }

    private boolean helper(int n,int[] nums, int sum,Boolean[][] dp) {
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return nums[0] == sum;
        }
        if (dp[n][sum] != null) {
            return dp[n][sum];
        }

        boolean notpick = helper(n-1, nums, sum,dp);
        boolean pick = false;
        if (nums[n]<=sum) {
            pick = helper(n-1, nums, sum-nums[n],dp);
        }

        return dp[n][sum] = pick || notpick;
    }
}
