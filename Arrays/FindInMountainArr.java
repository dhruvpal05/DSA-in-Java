package Arrays;

public class FindInMountainArr {
    interface MountainArray {
        public int get(int index) {}

        public int length() {}
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int s = 0;
        int e = mountainArr.length() -1;
        int peak = peakIndexInMountainArray()
    }
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] > arr[mid + 1]) {
                e = mid;
            }else{
                s = mid;
            }
        }
        return -1;
    }
}
