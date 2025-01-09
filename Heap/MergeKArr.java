import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKArr {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> kArrays = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(4);
        arr1.add(5);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(3);
        arr2.add(4);
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(2);
        arr3.add(6);
        kArrays.add(arr1);
        kArrays.add(arr2);
        kArrays.add(arr3);
        System.out.println(mergeKSortedArrays(kArrays, 3));
    }

    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k) {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<>();
        for (ArrayList<Integer> list : kArrays) {
            res.addAll(list);
        }
        int n = res.size();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(res.get(i));
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int j=0;
        
    }
}
