package Recursion;

import java.util.*;

public class NQueen {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        String row = ".".repeat(n);
        for (int i = 0; i < n; i++) {
            board.add(row);
        }
        solver(0, board, ans);
        return ans;
    }

    private void solver(int row, List<String> board, List<List<String>> ans) {
        if (row == board.size()) {
            ans.add(new ArrayList<>(board));
            return;
        }

        for (int col = 0; col < board.size(); col++) {
            if (isSafe(row, col, board)) {
                char[] rowChars = board.get(row).toCharArray();
                rowChars[col] = 'Q';
                board.set(row, new String(rowChars));

                solver(row + 1, board, ans);

                rowChars[col] = '.';
                board.set(row, new String(rowChars));
            }
        }
    }

    private boolean isSafe(int row, int col, List<String> board) {
        for (int i = 0; i < row; i++) {
            if (board.get(i).charAt(col) == 'Q')
                return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.size(); i--, j++) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }
        return true;
    }

}
