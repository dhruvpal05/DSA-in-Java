package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArr {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }
    public static void rotate(int[] nums, int k) {
        if (k == 0 || nums.length < 2) {
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = nums.length - k%nums.length; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < nums.length - k%nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        System.out.println(13%10);
    }
}
