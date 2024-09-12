package Bitmanipulation;

public class MinBitFlip {
    public static int minBitFlips(int start, int goal) {
        int ans = 0;
        String s = Integer.toBinaryString(start);
        String g = Integer.toBinaryString(goal);
        System.out.println(s);
        System.out.println(g);
        for (int i = s.length()-1; i >= 0; i--) {

            if (i<s.length() && i<g.length() && s.charAt(i) != g.charAt(i)) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        minBitFlips(3, 5);
    }
}
