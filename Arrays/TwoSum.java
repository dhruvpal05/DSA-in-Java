package Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ans=  twosum(nums, 9);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twosum(int[] nums, int target){
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}