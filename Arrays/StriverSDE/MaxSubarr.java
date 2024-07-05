package Arrays.StriverSDE;

import java.util.Arrays;

public class MaxSubarr {

    public int maxSubArray(int[] nums) {
        return getMax(nums, 0, nums.length - 1);
    }
    
    public static int getMax(int[] nums, int start, int end) {

        if (start == end) {
            return nums[start];
        }
    
        int mid = (start + end) / 2;
        int leftMax = getMax(nums, start, mid);
        int rightMax = getMax(nums, mid + 1, end);
    
        int leftSum = 0, rightSum = 0;
        int tempSum = 0;
        for (int i = mid; i >= start; i--) {
            tempSum += nums[i];
            leftSum = Math.max(leftSum, tempSum);
        }
        tempSum = 0;
        for (int i = mid + 1; i <= end; i++) {
            tempSum += nums[i];
            rightSum = Math.max(rightSum, tempSum);
        }
        int crossMax = leftSum + rightSum;
    
        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }
}
