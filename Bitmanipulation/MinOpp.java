package Bitmanipulation;

public class MinOpp {
    public int minOperations(int[] nums) {
        int ans = 0;
        int n = nums.length;
        if (n > 2) {
            int j = 2;
            for (int i = 0; j <= n; i++) {
                if (containZero(nums, i, j)) {
                    flip(nums, i, j);
                    ans++;
                }
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if (nums[i] == 0) {
                return -1;
            }
        }

        return ans;
    }

    private void flip(int[] nums, int i, int j) {
        for(int k = i;k<=j;k++){
            if (nums[k]==1) {
                nums[k]=0;
            }else{
                nums[k]=1;
            }
        }
    }

    private boolean containZero(int[] nums, int i, int j) {
        for(int k = i;k<=j;k++){
            if (nums[k]==0) {
                return true;
            }
        }
        return false;
    }
}
