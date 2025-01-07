public class XORofOcc {
    public static void main(String[] args) {
        System.out.println(Solve("aaaabbbbbbbb"));
    }

    public static int Solve(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                ans ^= (i + 1);
            }
        }
        return ans;
    }
}
