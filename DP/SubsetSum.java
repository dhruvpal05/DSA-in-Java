package DP;

import java.util.Arrays;

public class SubsetSum {
    public class Solution {
        // naive approach 
        static Boolean isSubsetSum1(int N, int arr[], int sum) {
            return helper(N, arr, sum);
        }

        private static Boolean helper(int n, int[] arr, int sum) {
            // Base cases
            if (sum == 0) {
                return true; 
            }
            if (n == 0) {
                return arr[0] == sum;
            }

            boolean not_taken = helper(n-1, arr, sum);
            boolean taken = helper(n-1, arr, sum-arr[n]);
            
            return not_taken || taken;
        }

        // memoization
        static Boolean isSubsetSum(int N, int arr[], int sum) {
        // Initialize the memoization table
        Boolean[][] dp = new Boolean[N][sum + 1];
        for (Boolean[] row : dp) {
            Arrays.fill(row, null);
        }
        return helper(N - 1, arr, sum, dp);
    }

    private static Boolean helper(int n, int[] arr, int sum, Boolean[][] dp) {
        // Base cases
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return arr[0] == sum;
        }

        // Check the memoization table
        if (dp[n][sum] != null) {
            return dp[n][sum];
        }

        // Exclude the current element
        boolean notTaken = helper(n - 1, arr, sum, dp);

        // Include the current element
        boolean taken = false;
        if (sum >= arr[n]) {
            taken = helper(n - 1, arr, sum - arr[n], dp);
        }

        // Store the result in the memoization table
        dp[n][sum] = notTaken || taken;
        return dp[n][sum];
    }
    }

}