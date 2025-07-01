import java.util.ArrayList;
import java.util.*;

public class DivideStr {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 9, 1, 3, 9, 5 };
        int key = 9;
        int k = 1;
        System.out.println(findKDistantIndices(nums, key, k));
    }

    public static String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int groups = (n + k - 1) / k;
        String[] res = new String[groups];

        for (int i = 0; i < groups; i++) {
            int start = i * k;
            int end = Math.min(start + k, n);
            String part = s.substring(start, end);
            while (part.length() < k) {
                part += fill;
            }
            res[i] = part;
        }
        return res;
    }

    public static ArrayList<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        ArrayList<Integer> keyIndices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                keyIndices.add(i);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j : keyIndices) {
                if (Math.abs(i - j) <= k) {
                    list.add(i);
                    break;
                }
            }
        }

        return list;
    }

}
