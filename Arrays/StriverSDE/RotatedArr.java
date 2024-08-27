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
