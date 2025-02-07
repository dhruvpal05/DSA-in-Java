package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersectionof2Arr {
    class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0, j = 0;
        List<Integer> intersection = new ArrayList<>();
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        // Convert the list to an array
        int[] result;
        
        result = new int[intersection.size()];
        
        return result;
    }
}
}
