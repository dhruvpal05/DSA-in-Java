package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intersection {
    public static ArrayList<Integer> IntersectionMap(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                map.put(nums2[i], map.get(nums2[i]) + 1);
            } else {
                map.put(nums2[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int keys : map.keySet()) {
            if (map.get(keys) > 1) {
                list.add(keys);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
    }
}
