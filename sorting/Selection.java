public class Selection {
    public static void main(String[] args) {
        
    }

    static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr, 0, last);
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
    }

    private static int getMax(int[] arr, int i, int last) {
        int max = i;
        for (int j = i; j <= last; j++) {
            if(arr[j]>arr[max]){
                max = j;
            }
        }
        return max;
    }
}
