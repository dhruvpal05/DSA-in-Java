package BinarySearch;

public class SingleNotDup {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if(mid%2==0 && nums[mid]==nums[mid+1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return nums[low];
    }
}
// [1,1,2,3,3,4,4,8,8]