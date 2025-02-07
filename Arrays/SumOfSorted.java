package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfSorted {
    public int rangeSum(int[] nums, int n, int left, int right) {
        if (nums == null || nums.length == 0 || left < 1 || right > (n * (n + 1)) / 2 || left > right) {
            return 0;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                list.add(currentSum);
            }
        }
        
        Collections.sort(list);

        for (int i = left - 1; i < right; i++) {
            sum += list.get(i);
        }
        
        return sum;
    }
}
