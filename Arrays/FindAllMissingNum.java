package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNum {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (int j = 1; j <= nums.length; j++) {
            if (nums[j] != j) {
                ans.add(j);
            }
        }

        return ans;
    }
}
