package Arrays;

public class CellsWithOdd {
    public int oddCells(int m, int n, int[][] indices) {
        int ans = 0;
        int[][] mat = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];
            for (int j = 0; j < n; j++) {
                mat[r][j]++;
            }
            for (int j = 0; j < m; j++) {
                mat[j][c]++;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]%2!=0){
                    ans++;
                }
            }
        }
        return ans;
    }
}
