package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class FrogJump {

    public static int frogJump(int n, int heights[]) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n,heights,dp);
    }

    private static int helper(int n, int[] heights, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        int left = helper(n-1, heights, dp) + Math.abs(heights[n] - heights[n-1]);
        int right = Integer.MAX_VALUE;
        if (n>1) {
            right = helper(n-2, heights, dp) + Math.abs(heights[n] - heights[n-2]);   
        }

        return dp[n] = Math.min(left, right);
    }

    // frog can make k jumps not only 1 and 2
    public static int frogJump2(int n,int k, int heights[]) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        return helper2(n,k,heights,dp);
    }


    private static int helper2(int n,int k ,int[] heights, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            int findmin = helper2(min-i, k, heights, dp) + Math.abs(heights[n]-heights[n-k]);
            min = Math.min(min, findmin);
        }

        return dp[n] = min;
    }
    public int minimizeCost(int arr[], int k) {
        int n = arr.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper2(n,k,arr,dp);
    }



}
