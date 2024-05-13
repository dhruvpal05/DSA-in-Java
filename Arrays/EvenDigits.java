package Arrays;

public class EvenDigits {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int numOfDigits = String.valueOf(nums[i]).length();
            if(numOfDigits%2 == 0){
                ans++;
            }
        }
        return ans;
    }
}
