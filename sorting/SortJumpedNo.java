import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class SortJumpedNo {

    public static void main(String[] args) {
        int[] nums = {991,338,38};
        int[] mapping = {8,9,4,0,2,1,3,5,7,6};

        sortJumbled(mapping, nums);
        
    }
    class Solution {
        public int[] sortJumbled(int[] mapping, int[] nums) {
          var n = nums.length;
          var arr = new int[n][2];
      
          for (var i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            
            if (nums[i] == 0)
              arr[i][1] = mapping[0];
      
            for (int j = nums[i], k = 1; j > 0; j /= 10, k *= 10)
              arr[i][1] += (mapping[j % 10] * k);
          }
          Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
      
          for (var i = 0; i < n; i++)
            nums[i] = arr[i][0];
      
          return nums;
        }
      }
}
