package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        helper(0,sub,nums,ans);
                return ans;
    }
        
    private void helper(int i,List<Integer> sub ,int[] nums, List<List<Integer>> ans) {
        int n = nums.length;
        if(i==n ){
            ans.add(new ArrayList<>(sub)); 
            return;
        }

        helper(i+1, sub, nums, ans);
        sub.add(nums[i]);
        helper(i+1, sub, nums, ans);
        sub.remove(sub.size() - 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        helper(0,sub,nums,ans);
        return ans;
    }
}
