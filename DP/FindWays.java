package DP;

import java.util.Arrays;

public class FindWays {
    public static int findWays(int num[], int tar) {
        int n = num.length;
        int[][] dp = new int[n][tar+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i],-1);
        }

        return helper(n-1,num,tar,dp);
    }

    private static int helper(int n, int[] num, int tar, int[][] dp) {
        if (tar == 0) {
            return 1;
        }
        if (n == 0) {
            if (num[0] == tar) {
                return 1;
            }else{
                return 0;
            }
        }
        if (tar < 0) {
            return 0;
        }
        if (dp[n][tar] != -1) {
            return  dp[n][tar];
        }

        int notpick = helper(n-1, num, tar,dp);
        int pick = helper(n-1, num, tar-num[n],dp);

        return dp[n][tar] = notpick + pick;
    }
}
