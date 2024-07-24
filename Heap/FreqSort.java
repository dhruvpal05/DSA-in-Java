import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;

public class FreqSort {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3}; // Corrected the syntax for array initialization
        frequencySort(nums);
    }
    public static int[]  frequencySort(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], hash.get(nums[i])+1);
            }else{
                hash.put(nums[i],1);
            }
        }
        ArrayList<Integer> list = new ArrayList();
        for (int key : hash.keySet()) {
            for (int i = 0; i < hash.get(key); i++) {
                list.add(key);
            }
        }
        // System.out.println(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
