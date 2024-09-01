package Arrays;

public class RotateImg {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - i];
                matrix[i][matrix[i].length - 1 - i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
