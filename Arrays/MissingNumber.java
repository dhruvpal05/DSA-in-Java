package Arrays;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i+1 < nums.length && nums[i] + 1 != nums[i+1]) {
                return nums[i]+1;
            }
        }
        return -1;
    }
}
