package DP;

import java.util.ArrayList;

public class HouseRobber {
    public static long houseRobber(int[] valueInHouse) {
		int n = valueInHouse.length;
        long[] dp = new long[valueInHouse.length];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        int[] temp1 = new int[valueInHouse.length];
        int[] temp2 = new int[valueInHouse.length];
        for (int i = 0; i < valueInHouse.length; i++) {
            if (i != 0) {
                temp1[i-1] = valueInHouse[i];
            }
            if (i != n) {
                temp2[i] = valueInHouse[i];
            }
        }

        
        return Math.max(helper(temp1, n-1,dp), helper(temp2, n-1, dp));
	}

    private static long helper(int[] valueInHouse, int n, long[] dp) {
        if (n == 0) {
            return valueInHouse[n];
        }
        if (n < 0) {
            return 0;
        }   
        if (dp[n] != -1) {
            return dp[n];
        }

        long pick = helper(valueInHouse, n-2,dp) + valueInHouse[n];
        long notpick = helper(valueInHouse, n - 1,dp);

        dp[n] = Math.max(pick,notpick);

        return dp[n];
    }

    public int rob(int[] nums) {
        
    }
}
