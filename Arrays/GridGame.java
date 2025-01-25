package Arrays;

public class GridGame {
    public static void main(String[] args) {
        int[][] grid = {
                { 2, 5, 4 },
                { 1, 5, 1 }
        };
        System.out.println(gridGame(grid));
    }

    public static long gridGame(int[][] grid) {
        int n = grid[0].length;
    
        long[] topPrefix = new long[n];
        long[] bottomPrefix = new long[n];
        topPrefix[0] = grid[0][0];
        bottomPrefix[0] = grid[1][0];
    
        for (int i = 1; i < n; i++) {
            topPrefix[i] = topPrefix[i - 1] + grid[0][i];
            bottomPrefix[i] = bottomPrefix[i - 1] + grid[1][i];
        }
    
        // Simulate the first player's path
        long minSecondPlayerScore = Long.MAX_VALUE;
    
        for (int i = 0; i < n; i++) {
            // Scores remaining for the second player
            long topRemaining = topPrefix[n - 1] - topPrefix[i];
            long bottomRemaining = i > 0 ? bottomPrefix[i - 1] : 0;
    
            // Second player's best score after first player cuts through at column i
            long secondPlayerScore = Math.max(topRemaining, bottomRemaining);
            minSecondPlayerScore = Math.min(minSecondPlayerScore, secondPlayerScore);
        }
    
        return minSecondPlayerScore;
    }
    
    
    
}
