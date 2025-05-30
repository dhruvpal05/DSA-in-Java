package Greedy;

import java.util.*;;

public class LongestUneq {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        int n = words.length;
        for (int i = 1; i < n; i++) {
            if (groups[i] != groups[i - 1]) {
                res.add(words[i]);
            }
        }
        return res;
    }

    public String triangleType(int[] nums) {
        if (nums[0]==nums[1]&&nums[1]==nums[2]) {
            return "equilateral";
        }else if(nums[0]!=nums[1]&&nums[1]!=nums[2]&&nums[2]!=nums[0]){
            return "scalene";
        }else if(nums[0]!=nums[1]||nums[1]!=nums[2]||nums[2]!=nums[0]){
            return "isosceles";
        }else{
            return "none";
        }
    }
}
