package Arrays;

/**
 * FirstAndLast
 */
public class FirstAndLast {
    class Solution {

        private int startSearch(int[] arr, int target) {
            int start = 0, end = arr.length - 1, ans = -1, mid;
            while (start <= end) {
                mid = (start + end) / 2;
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    ans = mid;
                    end = mid - 1;
                }
            }
            return ans;
        }

        private int endSearch(int[] arr, int target) {
            int start = 0, end = arr.length - 1, ans = -1, mid;
            while (start <= end) {
                mid = (start + end) / 2;
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    ans = mid;
                    start = mid + 1;
                }
            }
            return ans;
        }

        public int[] searchRange(int[] arr, int target) {
            int[] result = new int[2];
            result[0] = startSearch(arr, target);
            result[1] = endSearch(arr, target);
            return result;
        }
    }

    // brute force solution
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = 0;
        int end = nums.length - 1;

        while (start < nums.length && nums[start] != target) {
            start++;
        }

        if (start == nums.length) {
            return ans;
        }

        while (end >= 0 && nums[end] != target) {
            end--;
        }

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

}