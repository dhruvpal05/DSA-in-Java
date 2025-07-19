package Recursion;

import java.util.*;;

public class GenParen {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println(isPaline("hello"));
    }

    public static int[] generateParenthesis(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = i;
        }
        return res;
    }

    public static boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        return true;
    }

    public static int[] rev(int[] arr) {
        helper(arr, 0);
        return arr;
    }

    private static void helper(int[] arr, int i) {
        if (i == arr.length - 1 - i || i > arr.length - i - 1) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        helper(arr, i + 1);
    }

    public static boolean isPaline(String s) {
        return check(s, 0);
    }

    private static boolean check(String s, int i) {
        if (i >= s.length() - i - 1)
            return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return check(s, i + 1);
    }

}
