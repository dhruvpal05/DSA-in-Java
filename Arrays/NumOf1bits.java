package Arrays;

public class NumOf1bits {
    // crzy sol
    public int hammingWeight1(int n) {
        return Integer.bitCount(n);
    }
    // normal sol
    public int hammingWeight(int n) {
        int ans = 0;
        String num = Integer.toBinaryString(n);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i)-'0' == 1) {
                ans++;
            }
        }
        return ans;
    }
}
