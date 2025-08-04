package Recursion;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 4, 5, 6, 3, 6 };
        SortArr(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void SortArr(int[] nums) {
        int n = nums.length;
        helper(nums, 0, n - 1);
    }

    private static void helper(int[] nums, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        helper(nums, low, mid);
        helper(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int i = 0;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[i++] = nums[left];
                left++;
            } else {
                temp[i++] = nums[right];
                right++;
            }
        }

        while (left <= mid) {
            temp[i++] = nums[left];
            left++;
        }
        while (right <= high) {
            temp[i++] = nums[right];
            right++;
        }

        for (int j = low; j <= high; j++) {
            nums[j] = temp[j - low];
        }
    }
}
