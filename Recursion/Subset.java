package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    // public List<List<Integer>> subsets(int[] nums) {
    //     int n = nums.length;
    //     List<List<Integer>> res = new ArrayList<>();
    //     helper(0,n,res,new ArrayList<>(),nums);
    //     return res;
    // }
        
    // private void helper(int i, int n, List<List<Integer>> res, ArrayList arrayList,int[] nums) {
    //     if(i==n){
    //         res.add(arrayList);
    //     }
    //     helper(i+1, n, res, arrayList, nums);
    //     arrayList.add(nums[i]);
    //     helper(i+1, n, res, arrayList , nums);
    // }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<>());
        for(int num:nums){
            int n = res.size();
            for(int i=0;i<n;i++){
                List<Integer> inner = new ArrayList<>(res.get(i));
                inner.add(num);
                res.add(inner);
            }
        }
        return res;
    }

        public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            int n = res.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(res.get(i));
                inner.add(num);
                if (!res.contains(inner))
                    res.add(inner);
            }
        }
        return res;
    }

}
