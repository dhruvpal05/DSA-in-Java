package Searching;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[1];
        for (int j = numbers.length-1, i = 0; i < numbers.length; i++) {
            if(j==i){
                j--;
            }
            if(numbers[j]+numbers[i] == target){
                ans[0] = i+1;
                ans[1] = j+1;
            }
        }
        return ans;
    }
}
