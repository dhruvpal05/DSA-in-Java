package Stackandqueue;

import java.util.ArrayList;
import java.util.Arrays;

public class NextGreter {
    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] ans = new int[nums1.length];
        for (int num : nums1) {
            boolean flag = false;
            for (int i = 0; i < nums2.length; i++) {
                if (num == nums2[i]) {
                    flag = true;
                }
                if (flag && nums2[i] > num) {
                    res.add(nums2[i]);
                    flag = false;
                    break;
                }
                if (i == nums2.length - 1) {
                    res.add(-1);
                }
            }
        }
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
