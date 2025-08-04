package Recursion;

import java.util.*;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = { 2, 5, 2, 1, 2 };
        System.out.println(combinationSum2(candidates, 5));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        HashSet<List<Integer>> res = new HashSet<>();
        Arrays.sort(candidates);
        helper(0, candidates, target, new ArrayList<>(), res);
        List<List<Integer>> ans = new ArrayList<>();
        for (List<Integer> ls : res) {
            ans.add(new ArrayList<>(ls));
        }
        return ans;
    }

    private static void helper(int i, int[] candidates, int target, List<Integer> list, HashSet<List<Integer>> res) {
        if (i >= candidates.length) {
            if (target == 0) {
                res.add(new ArrayList<>(list));
            }
            return;
        }
        if (candidates[i] <= target) {
            list.add(candidates[i]);
            helper(i + 1, candidates, target - candidates[i], list, res);
            list.remove(list.size() - 1);
        }
        helper(i + 1, candidates, target, list, res);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        findcombination(0, candidates, target, res, new ArrayList<>());
        return res;
    }

    private static void findcombination(int idx, int[] candidates, int target, List<List<Integer>> res,
            List<Integer> list) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }

            list.add(candidates[i]);
            findcombination(i + 1, candidates, target - candidates[i], res, list);
            list.remove(list.size() - 1);
        }
    }
}
