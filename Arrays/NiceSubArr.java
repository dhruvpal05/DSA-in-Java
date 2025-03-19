package Arrays;

public class NiceSubArr {
    // [1,3,8,48,10]
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int ans = 1;
        int curr = 1;
        for(int i=0;i<n-1;i++){
            if ((nums[i] & nums[i+1]) == 0) {
                curr++;
            }else{
                curr = 1;
            }
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
