package Arrays;

public class SortColours {
    public void sortColors(int[] nums) {
        int start = 0;
        int middle = 0;
        int end = nums.length - 1;
        while (middle <= end) {
            if (nums[middle] == 2) {
                int temp = nums[end];
                nums[end] = nums[middle];
                nums[middle] = temp;
                end--;
            } else if (nums[middle] == 0) {
                int temp = nums[start];
                nums[start] = nums[middle];
                nums[middle] = temp;
                start++;
                middle++;
            } else {
                middle++;
            }
        }
    }
}
