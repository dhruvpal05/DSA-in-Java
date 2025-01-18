package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class MinCostIdentical {
    public static void main(String[] args) {
        int[] arr = { 2,1 };
        int[] brr = {2,1};
        int k = 2;
        System.out.println(minCost(arr, brr, k));
    }

    public static long minCost(int[] arr, int[] brr, int k) {
        int n = arr.length;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(arr[i] - brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        long min = 0;
        for (int i = 0; i < n; i++) {
            min += Math.abs(arr[i] - brr[i]);
        }
        return Math.min(ans, min+k);
    }

}
