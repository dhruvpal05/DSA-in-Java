package Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Union {

    public static String UnionMap(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i],map.get(nums1[i])+1);
            }else{
                map.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                map.put(nums2[i],map.get(nums2[i])+1);
            }else{
                map.put(nums2[i], 1);
            }
        }
        return map.keySet().toString();
    }

    public static String UnionSet(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set.add(nums1[i]);
        }
        return set.toString();
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4,5,6,7};
        System.out.println(UnionMap(arr1, arr2));
    }
}
