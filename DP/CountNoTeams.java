package DP;

public class CountNoTeams {
    public int numTeams2(int[] rating) {
        int n = rating.length;
        int[] dp = new int[rating.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return helperMax(rating,n,dp,0,Integer.MAX_VALUE);
    }

    private int helperMax(int[] rating, int n, int[] dp, int count, int current) {
        if (n == 0) {
            return 0;
        }
        return current;
    }

    public int numTeams(int[] rating) {
        int count = 0;
        int n = rating.length;
    
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Increasing sequence
                    if (rating[i] < rating[j] && rating[j] < rating[k]) {
                        count++;
                    }
                    // Decreasing sequence
                    if (rating[i] > rating[j] && rating[j] > rating[k]) {
                        count++;
                    }
                }
            }
        }
    
        return count;
    }
    
}
