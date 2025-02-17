package Arrays;

public class GoodSum {
    public static void main(String[] args) {
        int[] nums = { 2,1};
        System.out.println(sumOfGoodNumbers(nums, 1));
    }

    public static int sumOfGoodNumbers(int[] nums, int k) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                if (nums[i] > nums[i + k]) {
                    ans += nums[i];
                }
            } else if (i > n - 1 - k) {
                if (nums[i] > nums[i - k]) {
                    ans += nums[i];
                }
            } else {
                if (nums[i] > nums[i + k] && nums[i] > nums[i - k]) {
                    ans += nums[i];
                }
            }
        }
        return ans;
    }
}
