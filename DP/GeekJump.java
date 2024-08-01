package DP;

public class GeekJump {
    public int minimumEnergy(int arr[], int N) {
        int[] dp = new int[N];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return helper(arr, N - 1, dp);
    }

    private int helper(int[] arr, int n,int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return Math.abs(arr[1] - arr[0]);
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int one = helper(arr, n - 1,dp) + Math.abs(arr[n] - arr[n - 1]);
        int two = Integer.MAX_VALUE;
        if (n >= 2) {
            two = helper(arr, n - 2, dp) + Math.abs(arr[n] - arr[n - 2]);
        }

        return dp[n] = Math.min(one, two);
    }

}
