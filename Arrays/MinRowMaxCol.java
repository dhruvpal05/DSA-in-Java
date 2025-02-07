package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * MinRowMaxCol
 */
public class MinRowMaxCol {

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowmin = Integer.MAX_VALUE;
            int colmax = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < rowmin) {
                    rowmin = matrix[i][j];
                    k = j;
                }
            }
            for (int z = 0; z < matrix.length; z++) {
                if (matrix[z][k] > colmax) {
                    colmax = matrix[z][k];
                }
            }
            if (rowmin == colmax) {
                list.add(rowmin);
            }
        }
        return list;
    }
}