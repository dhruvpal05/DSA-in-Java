package Arrays;

public class PairsOfSongs {
    public int numPairsDivisibleBy60(int[] time) {
        int ans = 0;
        for (int i = 0; i < time.length-1; i++) {
            for (int j = i+1; j < time.length; j++) {
                if ((time[i] + time[j]) % 60 == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
