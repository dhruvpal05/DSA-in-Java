package BinarySearch;

import java.util.ArrayList;

public class MedianSortedArr {
    public static void main(String[] args) {
        System.out.println(3 / 2);
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        list.sort((a, b) -> a - b);
        if (n % 2 == 0) {
            int mid = n / 2;
            return (list.get(mid) + list.get(mid - 1)) / 2.0;
        } else {
            int mid = n / 2;
            return list.get(mid);
        }
    }

    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        if (n % 2 == 0) {
        } else {
            int i = 0, j = 0;
            int count = n / 2;
            while (count > 0 && i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    i++;
                    count--;
                } else {
                    j++;
                    count--;
                }
            }

        }
        return 0.0;
    }
}
