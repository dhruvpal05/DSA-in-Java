package Arrays;

public class SpiralMat2 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int count = 1;
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n -1;
        while (count<=n*n){
            for (int i = colStart; i < colEnd; i++) {
                ans[rowStart][i] = count++;
            }
            rowStart++;
            for (int i = rowStart; i < rowEnd; i++) {
                ans[i][colStart] = count++;
            }
            colEnd--;
            if(rowStart<=rowEnd){
                for (int i = colEnd; i >= colStart; i--) {
                    ans[rowEnd][i] = count++;
                }
                rowEnd--;
            }
            if(colStart<=colEnd){
                for (int i = rowEnd; i >= rowStart ; i--) {
                    ans[i][colEnd] = count++;
                }
                colStart++;
            }
        }
        return ans;
    }
}
