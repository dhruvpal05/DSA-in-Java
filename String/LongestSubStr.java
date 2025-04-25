import java.util.ArrayList;
import java.util.Collections;

public class LongestSubStr {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        int max = 0;
        int i = 0;
        int j = 0;
        while (j < n) {
            if (sb.substring(i, j).contains(sb.substring(j, j + 1))) {
                i++;
                j++;
            } else {
                j++;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] num = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                num[k] = nums1[i];
                i++;
            } else {
                num[k] = nums2[j];
                j++;
            }
            k++;
        }
        if (n % 2 == 0) {
            return (double) ((num[n / 2] + num[(n / 2) + 1]) / 2);
        } else {
            return (double) (num[n / 2]);
        }
    }
}
