package Maps;

import java.util.HashSet;

public class maxUniSubAr {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int s : set) {
            if (s > 0) {
                ans += s;
            }
        }
        return ans;
    }
}
