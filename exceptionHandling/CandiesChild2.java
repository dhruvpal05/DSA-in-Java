package exceptionHandling;

public class CandiesChild2 {
    public long distributeCandies(int n, int limit) {
        long ways = 0;
        int min = Math.max(0, n - 2 * limit);
        int max = Math.min(limit, n);
        for (int i = min; i <= max; i++) {
            int N = n - i;
            int ch2min = Math.max(0, N - limit);
            int ch2max = Math.min(limit, N);

            ways += (ch2max - ch2min + 1);
        }
        return ways;
    }

    public String answerString(String word, int numFriends) {
        int n = word.length();
        int max = n - numFriends;
        String ans = "";
        for (int i = 0; i < n; i++) {
            
            if (i + max >= n) {
                ans = (ans.compareTo(word.substring(i, n)) < 0) ? word.substring(i, n) : ans;
            } else {
                ans = (ans.compareTo(word.substring(i, i + max)) < 0) ? word.substring(i, i + max) : ans;
            }
        }

        return ans;
    }
}
