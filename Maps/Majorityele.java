package Maps;

import java.util.HashMap;

public class Majorityele {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i],hash.get(nums[i]) + 1);
            }else{
                hash.put(nums[i],1);
            }
        }

        for (int key : hash.keySet()){
            if (hash.get(key)>nums.length/3) {
                max = key;
            }
        }
        return max;
    }
}
