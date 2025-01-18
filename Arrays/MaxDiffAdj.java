package Arrays;

public class MaxDiffAdj {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 0 };
        System.out.println(maxAdjacentDistance(nums));
    }

    public static int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        ;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                max = Math.max(max, Math.abs(nums[i] - nums[0]));
            } else {
                max = Math.max(max, Math.abs(nums[i] - nums[i + 1]));
            }
        }
        return max;
    }
}
