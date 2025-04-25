package BinarySearch;

import java.util.*;

public class FairPairs {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 9, 2, 5 };
        System.out.println(countFairPairs(nums, 11, 11));
    }

    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }

    private static long count(int[] nums, int target) {
        long res = 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > target)
                right--;
            else
                res += right - left++;
        }
        return res;
    }
}
