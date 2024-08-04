package Contests;

public class 409q1 {
    class neighborSum {
    int[][] mat;

    public neighborSum(int[][] grid) {
        int n = grid.length;
        this.mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            this.mat[i] = grid[i].clone();
        }
    }
    
    public int adjacentSum(int value) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == value) {
                    if (i>0) {
                        sum+=mat[i-1][j];
                    }
                    if (i<mat.length-1) {
                        sum+=mat[i+1][j];
                    }
                    if (j>0) {
                        sum+=mat[i][j-1];
                    }
                    if (j<mat[0].length) {
                        sum+=mat[i][j+1];
                    }
                }
            }
        }
        return sum;
    }
    
    public int diagonalSum(int value) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == value) {
                    if (i>0 && j>0) {
                        sum+=mat[i-1][j-1];
                    }
                    if (i>0 && j<mat[0].length) {
                        sum+=mat[i+1][j-1];
                    }
                    if (j>0 && i< mat.length) {
                        sum+=mat[i-1][j+1];
                    }
                    if (j<mat[0].length && i< mat.length) {
                        sum+=mat[i+1][j+1];
                    }
                }
            }
        }
        return sum;
    }
}
}
