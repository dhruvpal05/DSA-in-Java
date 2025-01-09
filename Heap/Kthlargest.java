import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Kthlargest {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        // Kthlargest kl = new Kthlargest();
        System.out.println(findKthLargest(arr, k));
    }

    // public int findKthLargest1(int[] nums, int k) {
    // Arrays.sort(nums);
    // return nums[nums.length - k];
    // }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = nums.length - k + 1;
        for (int num : nums) {
            pq.add(num);
        }
        while (n-- > 0) {
            pq.poll();
        }
        return pq.peek();
    }
}
