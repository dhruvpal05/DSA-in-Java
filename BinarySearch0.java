public class BinarySearch0 {
    public static void main(String[] args){
        int[] arr = {2,4,7,9};
        System.out.println(binaray(arr,0));
    }
    static int binaray(int[] nums, int target){
        int ans = search(nums,0,nums.length-1,target);
        return ans;
    }
    private static int search(int[] arr, int start, int end, int target) {
        while (end>=start) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]>target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        // while (target<=end) {
        //     end--;
        // }
        return start;
    }
}
