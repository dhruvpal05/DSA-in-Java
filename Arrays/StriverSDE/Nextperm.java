package Arrays.StriverSDE;

import java.util.Arrays;

public class Nextperm {

public void nextPermutation(int[] nums) {
    int index = -1;
    
    // Step 1: Find the largest index `index` such that `nums[index] < nums[index + 1]`
    for (int i = nums.length - 2; i >= 0; i--) {
        if (nums[i] < nums[i + 1]) {
            index = i;
            break;
        }
    }
    
    // Step 2: If no such index exists, the permutation is the highest, so reverse to the lowest
    if (index == -1) {
        reverse(nums, 0, nums.length - 1);
        return;
    }
    
    // Step 3: Find the largest index `j` greater than `index` such that `nums[index] < nums[j]`
    for (int i = nums.length - 1; i > index; i--) {
        if (nums[i] > nums[index]) {
            // Step 4: Swap the values at `index` and `i`
            swap(nums, index, i);
            break;
        }
    }
    
    // Step 5: Reverse the sequence from `index + 1` to the end of the array
    reverse(nums, index + 1, nums.length - 1);
}

private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

private void reverse(int[] nums, int start, int end) {
    while (start < end) {
        swap(nums, start, end);
        start++;
        end--;
    }
}

}
