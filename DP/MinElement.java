package DP;

public class MinElement {
    public static int minimumElements(int num[], int x) {
        int n = num.length;
        return helper(n-1,num,x);
    }

    private static int helper(int n, int[] num, int target) {
        if (n == 0) {
            if (target%num[0] == 0) {
                return target/num[0];
            }else{
                return (int) Math.pow(10, 9);
            }
        }

        int notpick = 0 + helper(n-1,num,target);
        int pick = (int) Math.pow(10, 9);
        if (num[n]<=target) {
            pick = 1 + helper(n, num, target-num[n]);
        }
        int ans = Math.min(notpick, pick);
        if (ans>=Integer.MAX_VALUE) {
            return -1;
        }else{
            return ans;
        }
    }
}