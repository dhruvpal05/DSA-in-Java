package DP;

import java.util.Arrays;

public class QuestionBrainpower {
    public static long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] memo = new long[n];  
        Arrays.fill(memo, -1); 
        return solve(0, questions, memo);
    }

    public static long solve(int n, int[][] questions, long[] memo) {
        if (n >= questions.length) {
            return 0; 
        }
        if (memo[n] != -1) {
            return memo[n]; 
        }
        long take = questions[n][0] + solve(n + questions[n][1] + 1, questions, memo);
        long notTake = solve(n + 1, questions, memo);
        memo[n] = Math.max(take, notTake);
        return memo[n];
    }

}
