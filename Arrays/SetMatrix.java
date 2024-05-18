package Arrays;

public class SetMatrix {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];  

        // Initialize row and col arrays to -1 (or any non-zero value)
        for (int i = 0; i < row.length; i++) {
            row[i] = -1;
        }
        for (int i = 0; i < col.length; i++) {
            col[i] = -1;
        }

        // First pass: mark the rows and columns that need to be set to zero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }

        // Second pass: set the matrix cells to zero where needed
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == 0 || col[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
