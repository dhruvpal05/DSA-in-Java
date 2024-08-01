package DP;

public class MinFallingPath {
    public int minFallingPathSum1(int[][] matrix) {
        int col = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            col = Math.min(col, matrix[0][i]);
        }
        return helper(0, col, matrix);
    }

    private int helper2(int row, int col, int[][] matrix) {
        if (row == matrix.length - 1) {
            return matrix[row][col];
        }

        if (row < 0 || col < 0) {
            return 0;
        }

        int leftdiagonal = helper(row + 1, col - 1, matrix) + matrix[row][col];
        int below = helper(row + 1, col, matrix) + matrix[row][col];
        int rightdiagonal = helper(row + 1, col + 1, matrix) + matrix[row][col];
        int mindiagonal = Math.min(leftdiagonal, rightdiagonal);

        return Math.min(mindiagonal, below);
    }

    public int minFallingPathSum2(int[][] matrix) {
        int minPathSum = Integer.MAX_VALUE;

        // Check all starting columns in the first row
        for (int i = 0; i < matrix[0].length; i++) {
            minPathSum = Math.min(minPathSum, helper(0, i, matrix));
        }

        return minPathSum;
    }

    private int helper(int row, int col, int[][] matrix) {
        // Base case: last row
        if (row == matrix.length - 1) {
            return matrix[row][col];
        }

        // Check for out-of-bounds column indices
        if (col < 0 || col >= matrix[0].length) {
            return Integer.MAX_VALUE; // Represents an invalid path
        }

        // Recursive calls for three possible directions
        int leftDiagonal = helper(row + 1, col - 1, matrix);
        int below = helper(row + 1, col, matrix);
        int rightDiagonal = helper(row + 1, col + 1, matrix);

        // Add the current cell's value to the minimum of the three directions
        int minPath = Math.min(leftDiagonal, Math.min(below, rightDiagonal));

        return matrix[row][col] + minPath;
    }

    public int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
    
        // Create a DP array to store the minimum path sums for each row
        int[] dp = new int[cols];
    
        // Initialize the DP array with the first row of the matrix
        for (int i = 0; i < cols; i++) {
            dp[i] = matrix[0][i];
        }
    
        // Fill the DP array row by row
        for (int i = 1; i < rows; i++) {
            int[] currentRow = new int[cols];
            for (int j = 0; j < cols; j++) {
                int left = j > 0 ? dp[j - 1] : Integer.MAX_VALUE;
                int down = dp[j];
                int right = j < cols - 1 ? dp[j + 1] : Integer.MAX_VALUE;
    
                currentRow[j] = matrix[i][j] + Math.min(left, Math.min(down, right));
            }
            dp = currentRow;
        }
    
        // Find the minimum value in the last row of the DP array
        int minPathSum = Integer.MAX_VALUE;
        for (int value : dp) {
            minPathSum = Math.min(minPathSum, value);
        }
    
        return minPathSum;
    }
    

}
