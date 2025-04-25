package Bitmanipulation;

public class SubsetSumXOR {
    public int ans = 0;
    public int subsetXORSum(int[] nums) {
        helper(nums, 0, ans, 0);
        return ans;
    }

    private void helper(int[] nums, int i, int ans, int curr) {
        if (i == nums.length) {
            ans+=curr;
            return;
        }
        helper(nums, i+1, ans, curr^nums[i]);
        helper(nums, i+1, ans, curr);
    }
}
