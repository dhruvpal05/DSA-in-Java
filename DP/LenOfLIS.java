package DP;

import java.util.*;

public class LenOfLIS {
    public static void main(String[] args) {
        int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (int i = 0; i < n; i++) {
            pq.offer(new Pair(nums[i], i));
        }
        System.out.println(pq.size());
        int ans = 0;
        int currMin = Integer.MIN_VALUE;
        int currVal = Integer.MIN_VALUE;
        while (!pq.isEmpty()) { // 0,0 - 0,2 - 1,1 - 2,4 - 3,3 - 3,5
            Pair pair = pq.poll();
            int val = pair.val;
            int idx = pair.idx;
            if (val != currVal && idx > currMin) {
                currMin = idx;
                currVal = val;
                ans++;
            }
        }

        return ans;
    }

    public static class Pair {
        int val;
        int idx;
        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }
}
