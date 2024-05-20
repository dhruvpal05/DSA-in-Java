package Searching;
import java.lang.reflect.Array;
import java.util.Arrays;

public class QuicksortRec {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 8, 4, 7 };
        Quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void Quick(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;

        int mid = arr.length / 2;
        int pivot = arr[mid];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

        }
        Quick(arr, low, e);
        Quick(arr, s, high);
    }
}
