package Maps;

import java.util.*;

// import sun.tools.jar.resources.jar_es;

public class LHS {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        // Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        if (map.size() < 2) {
            return 0;
        }
        int ans = 0;
        for (Integer key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                ans = Math.max(ans, map.get(key) + map.get(key + 1));
            }
        }
        return ans;
    }

    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        int[][] dp = new int[n][W + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(n - 1, W, val, wt, dp);
    }

    private static int helper(int n, int w, int[] val, int[] wt, int[][] dp) {
        if (n == 0) {
            if (w >= wt[0]) {
                return val[0];
            } else {
                return 0;
            }
        }
        if (dp[n][w] != -1)
            return dp[n][w];

        int take = Integer.MIN_VALUE;
        if (w >= wt[n]) {
            take = val[n] + helper(n - 1, w - wt[n], val, wt, dp);
        }
        int nottake = 0 + helper(n - 1, w, val, wt, dp);

        return dp[n][w] = Math.max(take, nottake);
    }

    public int possibleStringCount(String word) {
        // HashMap<Character, Integer> map = new HashMap<>();
        int n = word.length();
        int ans = 1;
        for(int i=0;i<n-1;i++){
            if(word.charAt(i) == word.charAt(i+1)) ans++;
        }
        return ans;
    }
}
