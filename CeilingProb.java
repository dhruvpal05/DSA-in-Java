public class CeilingProb {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9};
        System.out.println(ceiling(arr,8));
    }

    static int ceiling(int[] arr, int target){
        int ans = search(arr,0,arr.length-1,target);
        return ans;
    }

    static int search(int[] arr, int start, int end, int target) {

        int mid = start + (end - start)/2; 
        if(end>=start){
            if(arr[mid] == target){
                return arr[mid];
            }
            
            if(arr[mid]>target){
                return search(arr, start, mid - 1, target);
            }

            return search(arr, mid + 1, end, target);
        }

        return arr[start];
    }
}
