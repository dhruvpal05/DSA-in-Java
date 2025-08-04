package Recursion;

import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(subsets(nums));

    }

    public static List<Integer> subsets(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        // List<Integer> sub = new ArrayList<>();
        helper2(0, 0, nums, ans);
        Collections.sort(ans);
        return ans;
    }

    private static void helper(int i, List<Integer> sub, int[] nums, List<List<Integer>> ans) {
        int n = nums.length;
        if (i == n) {
            ans.add(new ArrayList<>(sub));
            return;
        }

        helper(i + 1, sub, nums, ans);
        sub.add(nums[i]);
        helper(i + 1, sub, nums, ans);
        sub.remove(sub.size() - 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        helper(0, sub, nums, ans);
        return ans;
    }

    // array of sum of all subsets

    private static void helper2(int i, int sum, int[] nums, List<Integer> ans) {
        int n = nums.length;
        if (i == n) {
            ans.add(sum);
            return;
        }
        helper2(i + 1, sum, nums, ans);
        sum += nums[i];
        helper2(i + 1, sum, nums, ans);
        sum -= nums[i];
    }

}
