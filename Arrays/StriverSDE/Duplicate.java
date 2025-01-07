import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);

    }
    // public int findDuplicate(int[] nums) {
    //     // Arrays.sort(nums);
    //     // for (int i = 0; i < nums.length; i++) {
    //     //     if (nums[i] == nums[i+1]) {
    //     //         return nums[i];
    //     //     }
    //     // }
    //     // return nums[0];
    //     int n = nums.length;
    //     int freq[] = new int[n + 1];
    //     for (int i = 0; i < n; i++) {
    //         if (freq[nums[i]] == 0) {
    //             freq[nums[i]] += 1;
    //         } else {
    //             return nums[i];
    //         }
    //     }
    //     return 0;
    // }
}

// [3,0,6,1,5]
// 0,1,3,5,6