package Arrays.StriverSDE;

public class Search2D {
    public boolean searchMatrix2(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] > target) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[i-1][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
