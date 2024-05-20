package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrySortedOrNot {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        // System.out.println(findtarget(arr, 5, 0));
        sumTriangle(arr);
    }

    static boolean sorted(int arr[], int index) {
        if (index == arr.length + 1) {
            return true;
        }
        return arr[index] > arr[index + 1] && sorted(arr, index + 1);
    }

    static int findtarget(int arr[], int target, int index) {
        if (index == arr.length + 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findtarget(arr, target, index + 1);
    }

    static void sumTriangle(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // if(arr.length == 1){
        //     System.out.println(list);
        // }
        if (arr.length < 1)
            return;
   
        for (int i = 0; i < arr.length -1 ; i++) {
            list.add(arr[i] + arr[i+1]);
        }
        Integer arr1[] = new Integer[list.size()];
        arr1 = list.toArray(arr1);

        sumTriangle(arr1);
        System.out.println(list);
    }
}
