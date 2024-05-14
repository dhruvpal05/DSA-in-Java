package Arrays;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[j] == nums[i]){
                i++;
            }else{
                nums[++j] = nums[i];
            }
            
        }
        return j;
    }
}
