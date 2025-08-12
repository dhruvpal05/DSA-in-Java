package Maps;

import java.util.*;

public class Count {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        int count = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                count = 0;
            } else if (map.get(key) == max) {
                count++;
            }
        }
        return max * count;
    }
}
