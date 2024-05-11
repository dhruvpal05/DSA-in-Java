package Arrays;

public class Shuffle {
    public static void main(String[] args) {
        
    }
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i+=2) {
            ans[i] = nums[i-2];
        }
        return ans;
    }
}
