import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArr {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pt1 = m - 1; // Pointer for the last initialized element in nums1
        int pt2 = n - 1; // Pointer for the last element in nums2
        int i = m + n - 1; // Pointer for the last position in nums1's total capacity

        // Merge nums2 into nums1 starting from the end
        while (pt1 >= 0 && pt2 >= 0) {
            if (nums1[pt1] > nums2[pt2]) {
                nums1[i--] = nums1[pt1--];
            } else {
                nums1[i--] = nums2[pt2--];
            }
        }

        // If there are remaining elements in nums2, copy them over
        while (pt2 >= 0) {
            nums1[i--] = nums2[pt2--];
        }

        // No need to copy remaining elements from nums1 since they are already in place
    }

    public static void main(String[] args) {
        MergeArr ma = new MergeArr();
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;
        // int[] ans = ma.merge(nums1, m, nums2, n);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
