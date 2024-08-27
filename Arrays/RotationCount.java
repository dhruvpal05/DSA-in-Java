package Arrays;

public class RotationCount {
    // brute force
    public static int count(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                return i + 1;
            }
        }
        return -1;
    }

    // optimized binary search
    // find the pivot and then pivot + 1 is the ans

    public static int count1(int[] nums){
        int pivot = findPivot(nums);
        return pivot +1;
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
