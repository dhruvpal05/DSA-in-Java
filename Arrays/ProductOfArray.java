package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }
        postfix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            postfix[i] = nums[i + 1] * postfix[i + 1];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0)
                ans[i] = postfix[i + 1];
            else if (i == n - 1)
                ans[i] = prefix[i - 1];
            else
                ans[i] = prefix[i - 1] * postfix[i + 1];
        }
        return ans;
    }
}
