package DP;

public class HouseRobber {
    public static long houseRobber(int[] valueInHouse) {
		int n = valueInHouse.length;
        int[] dp = new int[valueInHouse.length];

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

    private static int helper(int[] valueInHouse, int n, int[] dp) {
        if (n == 0) {
            return valueInHouse[n];
        }
        if (n < 0) {
            return 0;
        }   
        if (dp[n] != -1) {
            return dp[n];
        }

        int pick = helper(valueInHouse, n-2,dp) + valueInHouse[n];
        int notpick = helper(valueInHouse, n - 1,dp);

        dp[n] = Math.max(pick,notpick);

        return dp[n];
    }

    public int rob1(int[] nums) {
        int n =nums.length;
        int[] dp = new int[nums.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return helper2(nums, n,dp);
    }

    private int helper2(int[] nums, int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return 0;
        }

        if (dp[n]!=-1) {
            return dp[n];
        }
        int left = helper2(nums, n-2, dp) + nums[n];
        int right = helper2(nums, n-1, dp);

        return Math.max(left, right);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[nums.length];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        int[] temp1 = new int[nums.length];
        int[] temp2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                temp1[i-1] = nums[i];
            }
            if (i != n) {
                temp2[i] = nums[i];
            }
        }
        return Math.max(helper(temp1, n-1,dp), helper(temp2, n-1, dp));
    }
}
