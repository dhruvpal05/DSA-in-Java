public class FindPeak {
    public int findPeakElement(int[] nums) {
        int high = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > high){
                high = nums[i];
                index = i;
            }
        }
        return index;
    }
}
