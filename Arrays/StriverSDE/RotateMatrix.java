package Arrays.StriverSDE;

import java.security.PublicKey;
import java.util.Arrays;

public class RotateMatrix {
    public static void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(i, j, matrix);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j];
                matrix[i][n - j] = temp;
            }
        }
    }

    private static void swap(int i, int j, int[][] matrix) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static int[][] rotate2(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][n - 1 - i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] ans = rotate(matrix);
        // for (int[] row : ans) {
        //     System.out.println(Arrays.toString(row));
        // }
    }
}