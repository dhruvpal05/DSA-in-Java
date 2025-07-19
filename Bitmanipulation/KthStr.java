package Bitmanipulation;

public class KthStr {
    public static void main(String[] args) {
        // System.out.println('a' + '1');
        System.out.println(kthCharacter(5));
    }

    public static char kthCharacter(int k) {
        String ans = helper("a", k);
        return ans.charAt(k - 1);
    }

    private static String helper(String string, int k) {
        if (string.length() >= k) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (c == 'z') {
                sb.append('a');
            } else {
                sb.append((char) (c + 1));
            }
        }
        String newString = string + sb.toString();
        return helper(newString, k);
    }
}
