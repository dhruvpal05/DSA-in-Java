package Arrays;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sum(nums, i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int sol = sum(arr, 2);
        System.out.println(sol);
    }

    static int sum(int[] arr, int a){
        if (a == -1) {
            return 0;
        }
        return arr[a] + sum(arr, a - 1); 
    }
}
