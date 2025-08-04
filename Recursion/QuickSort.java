package Recursion;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 4, 5, 6, 3, 6 };
        quicksort(nums);

        // Print sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void quicksort(int[] nums) {
        helper(nums, 0, nums.length - 1);
    }

    private static void helper(int[] nums, int low, int high) {
        if (low < high) {
            int pIdx = partition(nums, low, high);
            helper(nums, low, pIdx - 1);
            helper(nums, pIdx + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int left = low + 1;
        int right = high;

        while (left <= right) {
            while (left <= right && nums[left] <= pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left < right) {
                swap(nums, left, right);
            }
        }

        swap(nums, low, right); // Place pivot in correct position
        return right;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
