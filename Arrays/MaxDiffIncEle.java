package Arrays;

public class MaxDiffIncEle {
    public int maximumDifference(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                ans = Math.max(ans, nums[j] - nums[i]);
            }
        }
        if (ans == 0) {
            return -1;
        } else {
            return ans; 
        }
    }
}
