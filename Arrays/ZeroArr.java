package Arrays;

public class ZeroArr {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        if (n == 0)
            return 0; // Edge case: empty array

        int k = 0;
        for (int[] q : queries) {
            if (isZero(nums))
                break; // Stop early if all elements are zero
            k++;

            int l = q[0];
            int r = q[1];
            int val = q[2];

            // Boundary check
            if (l < 0 || r >= n || l > r)
                continue;

            for (int i = l; i <= r; i++) {
                if (nums[i] != 0) {
                    nums[i] = Math.max(0, nums[i] - val);
                }
            }
        }
        if (isZero(nums)) {
            return k;
        }else{
            return -1;
        }
    }

    public boolean isZero(int[] nums) {
        for (int num : nums) {
            if (num != 0)
                return false;
        }
        return true;
    }
}
