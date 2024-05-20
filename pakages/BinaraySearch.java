package pakages;
public class BinaraySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9};
        System.out.println(binaray(arr,6));
    }

    static int binaray(int[] arr, int target){
        int ans = search(arr,0,arr.length-1,target);
        return ans;
    }

    private static int search(int[] arr, int start, int end, int target) {

        int mid = start + (end - start)/2; 
        if(end>=start){
            if(arr[mid] == target){
                return mid;
            }
            
            if(arr[mid]>target){
                return search(arr, start, mid - 1, target);
            }

            return search(arr, mid + 1, end, target);
        }

        return -1;
    }
}
