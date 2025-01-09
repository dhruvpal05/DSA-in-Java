import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxSumComb {
    public static void main(String[] args) {
        int[] A = { 1, 4, 2, 3 };
        int[] B = { 2, 5, 1, 6 };
        int C = 4;
        int[] res = solve1(A, B, C);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    // naive approach
    public static int[] solve(int[] A, int[] B, int C) {
        int n = A.length;
        int[] res = new int[C];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pq.add(A[i] + B[j]);
            }
        }
        for (int i = 0; i < C; i++) {
            res[i] = pq.poll();
        }
        return res;
    }

    // optimized approach
    public static int[] solve1(int[] A, int[] B, int C) {
        int n = A.length;
        int[] res = new int[C];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (pq.size() < C) {
                    pq.add(A[i] + B[j]);
                } else {
                    if (A[i] + B[j] < pq.peek()) {
                        break;
                    } else {
                        pq.poll();
                        pq.add(A[i] + B[j]);
                    }
                }
            }
        }
        for (int i = C - 1; i >= 0; i--) {
            res[i] = pq.poll();
        }
        return res;
    }
}
