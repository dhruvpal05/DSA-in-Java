package Arrays.StriverSDE;

import java.util.ArrayList;
import java.util.List;

public class PascalsTri {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            for (int j = 0; j < i; j++) {
                List<Integer> Internal = new ArrayList<>();
                List<Integer> prevRow = list.get(i - 1);

                if (j == 0) {
                    Internal.add(1);
                }
                if (j == i) {
                    Internal.add(1);
                }
                Internal.add(prevRow.get(j) + prevRow.get(j+1));
            }
        }

        return list;
    }

    public List<List<Integer>> generatee(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
    
        // First base case; if user requests zero rows, they get zero rows.
        if (numRows == 0) {
            return triangle;
        }
    
        // Second base case; the first row is always [1].
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
    
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
    
            // The first row element is always 1.
            row.add(1);
    
            // Each triangle element (except the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
    
            // The last row element is always 1.
            row.add(1);
    
            triangle.add(row);
        }
    
        return triangle;
    }
    
}
