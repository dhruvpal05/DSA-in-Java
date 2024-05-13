package Arrays;

import java.util.ArrayList;

public class TargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        ArrayList<Integer> list =  new ArrayList<>();
        for (int i = 0; i < ans.length; i++) {
            list.add(index[i],nums[i]);
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

}
