import java.util.ArrayList;
import java.util.Arrays;

public class AtoiStr {
    public static void main(String[] args) {
        String s = "-42";
        System.out.println(myAtoi(s));
    }

    // public static int myAtoi(String s) {
    // s = s.trim();
    // if (s.isEmpty())
    // return 0;
    // int i = 0;
    // int n = s.length();
    // boolean isNegative = false;
    // if (s.charAt(i) == '-' || s.charAt(i) == '+') {
    // isNegative = s.charAt(i) == '-';
    // i++;
    // }
    // long result = 0;
    // while (i < n) {
    // char c = s.charAt(i);
    // if (!Character.isDigit(c)) {
    // break;
    // }
    // result = result * 10 + Character.getNumericValue(c);
    // if (result > Integer.MAX_VALUE) {
    // return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    // }
    // i++;
    // }
    // return isNegative ? (int) -result : (int) result;
    // }

    // recursive implementation
    public static int myAtoi(String s) {
        s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        return 0;

    }
}
