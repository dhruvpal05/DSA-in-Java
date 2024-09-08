public class SumofDigit {
    public int getLucky(String s, int k) {
        String solution = "";
        for (int index = 0; index < s.length(); index++) {
            solution += s.charAt(index) - '0'- 48;
        }
        int j = 0;
        int ans = 0;
        while (++j<k) {
            ans += solution.charAt(j);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println('a'-'0'-48);
    }
}
