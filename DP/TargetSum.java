package DP;

import java.util.Arrays;

public class TargetSum {
    public static int targetSum(int n, int target, int[] arr) {
        int[][] dp = new int[n][target+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i],-1);
        }
        return helper(n,target,arr,0,dp);
    }

    private static int helper(int n, int target, int[] arr, int i, int[][] dp) {
        if (n == 0) {
            if (target == i) {
                return 1;
            }else{
                return 0;
            }
        }
        if (target == i) {
            return 1;
        }
        if (dp[n][i] != -1) {
            return dp[n][i];
        }

        int minus = helper(n-1, target, arr,i-arr[n],dp);
        int plus = helper(n-1, target, arr,i+arr[n],dp);

        return dp[n][i] = minus+plus;
    }
}
