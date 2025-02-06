package Arrays;

public class MaxAcs {
    public static void main(String[] args) {
        int[] nums = {10,20,30,5,10,50};
        System.out.println(maxAscendingSum(nums));
    }

    public static int maxAscendingSum(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int ans = nums[0];  // Initialize with first element
        int curr = nums[0]; // Current sum for an ascending subarray

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                curr += nums[i]; // Continue the ascending subarray
            } else {
                ans = Math.max(ans, curr); // Update the answer before resetting
                curr = nums[i]; // Start a new subarray
            }
        }

        ans = Math.max(ans, curr); // Final check to update the max sum
        return ans;
    }
}
