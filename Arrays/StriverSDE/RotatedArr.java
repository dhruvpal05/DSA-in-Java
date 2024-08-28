package Arrays.StriverSDE;

public class RotatedArr {
    // brute force
    public int search1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    // optimized binary search
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int firstPart = binarySearch(nums, target, 0, pivot);
        if (firstPart != -1) {
            return firstPart;
        }
        return binarySearch(nums, target, pivot, nums.length-1);

    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] > target) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length -1;
        while (s<=e) {
            int mid = s + (e - s)/2;
            // 4 cases
            if (mid < e && arr[mid] > arr[mid +1]) {
                return mid;
            }
            if (mid > s && arr[mid] < arr[mid-1]) {
                return mid;
            }

            if (arr[mid]<=arr[s] ) {
                e = mid-1;
            }else{
                s =mid + 1;
            }
        }

        return -1;
    }
}
