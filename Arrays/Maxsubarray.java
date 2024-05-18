package Arrays;

public class Maxsubarray {
    public int maxSubArray(int[] nums) {
        int ans = 0;
        for(int num : nums){
            if(num>0){
                ans+=num;
            }
        }
        return ans;
    }
}
