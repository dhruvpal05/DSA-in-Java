import java.util.ArrayList;
import java.util.PriorityQueue;

public class MInHeap {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        System.out.println(arr.length);
    }

    static int[] minHeap(int n, int[][] q) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min-heap by default in Java
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int operation = q[i][0];
            if (operation == 0) {
                int value = q[i][1];
                minHeap.add(value);
            } else if (operation == 1) {
                if (!minHeap.isEmpty()) {
                    result.add(minHeap.poll());
                }
            }
        }
        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        return output;
    }
}
