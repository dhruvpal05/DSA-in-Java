package BinarySearch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MedianofMat {
    public static int median1(int mat[][]) {
        // code here
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                list.add(mat[i][j]);
            }
        }
        int n = list.size();
        Collections.sort(list);
        return list.get(n / 2);
    }

    public static int median(int mat[][]) {
        int r = mat.length; // Number of rows
        int c = mat[0].length; // Number of columns

        // Initialize low and high to the minimum and maximum possible values in the
        // matrix
        int low = mat[0][0];
        int high = mat[0][c - 1];
        for (int i = 1; i < r; i++) {
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][c - 1]);
        }

        int desiredCount = (r * c) / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = blackbox(mat, mid); // Number of elements <= mid
            if (count <= desiredCount) {
                low = mid + 1; // Median must be greater
            } else {
                high = mid - 1; // Median must be smaller or equal
            }
        }
        return low; // 'low' will converge to the median
    }

    private static int blackbox(int[][] mat, int mid) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            count += countLessEqual(mat[i], mid); // Count elements <= mid in each row
        }
        return count;
    }

    private static int countLessEqual(int[] row, int mid) {
        int low = 0, high = row.length - 1;
        while (low <= high) {
            int m = low + (high - low) / 2;
            if (row[m] <= mid) {
                low = m + 1; // Move to the right
            } else {
                high = m - 1; // Move to the left
            }
        }
        return low; // 'low' is the count of elements <= mid
    }

}
