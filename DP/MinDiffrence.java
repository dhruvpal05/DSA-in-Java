package DP;

public class MinDiffrence {
    public int minimumDifference(int[] nums) {
        int totsum = 0;
        for (int num : nums) {
            totsum+=num;
        }
        int len = nums.length;

        return helper(len-1,nums,totsum/2);
    }

    private int helper(int len, int[] nums, int totsum) {
        if (totsum == 0) {
            return 0;
        }
        if (len == 0) {
            return Integer.MAX_VALUE;
        }

        int notpick = helper(len-1, nums, totsum);
        int pick = Integer.MAX_VALUE;
        if (nums[len]<totsum) {
            pick = helper(len-1, nums, totsum-nums[len]) + nums[len];
        }

        return Math.min(notpick, pick);
    }
}
