package Arrays;

public class ZeroSum {
    public int[] sumZero(int n) {
        int[] ans = new int[n];

        for (int i = 0; i < ans.length / 2; i++) {
            ans[i] = 100 + i;
            ans[ans.length - 1 - i] = -100 - i;
        }

        return ans;
    }
}
