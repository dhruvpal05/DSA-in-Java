package Arrays;

public class FindPivot {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int curr = 0;
        for (int num : nums) {
            total+=num;
        }
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            if (curr == total - curr - nums[i]) {
                return i + 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            // If the left sum equals the right sum
            if (curr == total - curr - nums[i]) {
                return i;
            }
            curr += nums[i];
        }

        return -1;
    }
}
