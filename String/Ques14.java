

public class Ques14 {
    public static void main(String[] args) {
        solve("8$$3R");
    }

    public static void solve1(String L) {
        int n = L.length();
        for (int i = 1; i < n - 1; i++) {
            if (L.charAt(i) == '$') {
                if (Character.isDigit(L.charAt(i - 1)) && Character.isDigit(L.charAt(i + 1))) {
                    int sum = Character.getNumericValue(L.charAt(i - 1))
                            + Character.getNumericValue(L.charAt(i + 1));
                    char letter = (char) ('A' + sum - 1);
                    System.out.println(letter);
                } else {
                    char c1 = L.charAt(i - 1);
                    char c2 = L.charAt(i + 1);
                    int num1 = c1 - 'A' + 1;
                    int num2 = c2 - 'A' + 1;
                    int sum = num1 + num2;
                    System.out.println(sum);
                }
            }
        }
    }

    public static void solve(String L) {
        int n = L.length();
        for (int i = 0; i < n; i++) {
            if (L.charAt(i) == '$') {
                int left = i - 1;
                while (left >= 0 && L.charAt(left) == '$') {
                    left--;
                }
                int right = i + 1;
                while (right < n && L.charAt(right) == '$') {
                    right++;
                }
                if (left >= 0 && right < n) {
                    char leftChar = L.charAt(left);
                    char rightChar = L.charAt(right);
                    if (Character.isDigit(leftChar) && Character.isDigit(rightChar)) {
                        int sum = Character.getNumericValue(leftChar) + Character.getNumericValue(rightChar);
                        char letter = (char) ('A' + sum - 1);
                        System.out.println(letter);
                    } else {
                        int num1 = leftChar - 'A' + 1;
                        int num2 = rightChar - 'A' + 1;
                        int sum = num1 + num2;
                        System.out.println(sum);
                    }
                }
            }
        }
    }

}