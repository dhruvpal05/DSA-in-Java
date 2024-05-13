package Arrays;

public class SmallerNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < ans.length; j++) {
                if(nums[j] < nums[i] && j != i){
                    count += 1;
                }
                ans[i] = count;
            }
        }
        return ans;
    }
}
