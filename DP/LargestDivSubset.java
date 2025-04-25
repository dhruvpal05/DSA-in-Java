package DP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LargestDivSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        return ans;
    }

    public int minimumOperations(int[] nums) {
        int last = 0;
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            if (set.contains(nums[i])) {
                return (i+3)/3;
            } else {
                set.add(nums[i]);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(4/3);
    }

}
