package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxPos {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        int pos = 0;
        int neg = 0;
        for (int num : nums) {
            if (num > 0) {
                pos++;
            } else if(num<0){
                neg++;
            }
        }

        return Math.max(pos, neg);
    }
}
