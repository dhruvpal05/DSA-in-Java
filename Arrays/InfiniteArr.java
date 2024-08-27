package Arrays;

public class InfiniteArr {
    public static int infinite(int[] nums, int target){
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            start = end +1;
            if (end*2<=nums.length) {
                end = end*2;
            }else{
                end = nums.length-1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,5,8,9,10,15};
        System.out.println(infinite(nums, 12));
    }
}
