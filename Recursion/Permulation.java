package Recursion;

import java.util.*;

public class Permulation {
    // public static void main(String[] args) {
    // // perm("", "abc");
    // Kthperm("", "abc", 3);
    // }

    static void perm(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            perm(p.substring(0, i) + ch + p.substring(i), up.substring(1));
        }
    }

    static int count = 0;

    static void Kthperm(String p, String up, int n) {
        if (up.isEmpty()) {
            count++;
            if (count == n) {
                System.out.println(p);
            }
            return;
        }

        char ch = up.charAt(0);
        for (int j = 0; j <= p.length(); j++) {
            String newP = p.substring(0, j) + ch + p.substring(j);
            Kthperm(newP, up.substring(1), n);
            if (count == n)
                return;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        // boolean[] vis = new boolean[n];
        List<List<Integer>> ans = new ArrayList<>();
        opti(0, nums, ans);
        return ans;
    }

    private void opti(int idx, int[] nums, List<List<Integer>> ans) {
        if (idx == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(idx, i, nums);
            opti(i, nums, ans);
            swap(i, idx, nums);
        }
    }

    private void swap(int idx, int i, int[] nums) {
        int temp = nums[idx];
        nums[idx] = nums[i];
        nums[i] = temp;
    }

    private void helper(int idx, int[] nums, boolean[] vis, List<List<Integer>> ans, List<Integer> list) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (vis[i] == false) {
                vis[i] = true;
                list.add(nums[i]);
                helper(idx + 1, nums, vis, ans, list);
                vis[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        System.out.println(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] vis = new boolean[n];
        unique(0, nums, vis, ans, new ArrayList<>());
        return ans;
    }

    private static void unique(int idx, int[] nums, boolean[] vis, List<List<Integer>> ans, List<Integer> list) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (vis[i])
                continue;
            if (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])
                continue;

            vis[i] = true;
            list.add(nums[i]);
            unique(idx + 1, nums, vis, ans, list);
            vis[i] = false;
            list.remove(list.size() - 1);
        }
    }
}
