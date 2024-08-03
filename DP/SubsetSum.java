package DP;

public class SubsetSum {
    public class Solution {
        static Boolean isSubsetSum(int N, int arr[], int sum) {
            return helper(N, arr, sum);
        }

        private static Boolean helper(int n, int[] arr, int sum) {
            // Base cases
            if (sum == 0) {
                return true; // Found a subset with the required sum
            }
            if (n == 0) {
                return false; // No elements left to process and sum is not achieved
            }
            // Exclude the current element and move to the next
            if (helper(n - 1, arr, sum)) {
                return true;
            }

            // Include the current element in the sum (only if it doesn't exceed the sum)
            if (sum >= arr[n - 1] && helper(n - 1, arr, sum - arr[n - 1])) {
                return true;
            }

            return false;
        }
    }

}