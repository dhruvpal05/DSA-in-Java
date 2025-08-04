package Recursion;

public class SudokuSolv {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public static boolean solve(char[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c < '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (solve(board) == true) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c) {
                return false;
            }
            if (board[i][col] == c) {
                return false;
            }

            if (board[row + i / 3][col + i % 3] == c) {
                return false;
            }
        }

        return true;
    }
}
