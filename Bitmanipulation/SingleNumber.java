package Bitmanipulation;

import java.util.HashMap;

public class SingleNumber {
    public int singleNumber1(int[] nums) {
        // int n = nums.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // for (int key : map.keySet()) {
        // if (map.get(key) == 1) {
        // return map.get(key);
        // }
        // }
        // return -1;
        int ans = 0;
        for (int num : nums)
            ans ^= num;
        return ans;
    }

    public int singleNumber2(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

}
