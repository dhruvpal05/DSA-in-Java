package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] ans = new int[nums.length];
        if (nums.length > 0) {
            prefix[0] = nums[0];
            for (int i = 1; i < prefix.length; i++) {
                prefix[i] = nums[i] * prefix[i - 1];
            }
            postfix[nums.length-1] = nums[nums.length - 1];
            for (int i = nums.length - 2; i < postfix.length; i--) {
                postfix[i] = postfix[i+1]*nums[i]; 
            }
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix[i]*postfix[i];
        }
        return ans;

    }
}
