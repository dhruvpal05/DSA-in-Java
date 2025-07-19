package Recursion;

import java.util.*;

// import Arrays.List;
// import sun.tools.serialver.resources.serialver;

public class General {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        System.out.println();
        printSubSeqSum(nums, 2);
    }

    public static int[] rev(int[] arr) {
        helper1(arr, 0);
        return arr;
    }

    private static void helper1(int[] arr, int i) {
        if (i == arr.length - 1 - i || i > arr.length - i - 1) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        helper1(arr, i + 1);
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

    // 1, 2, 3, 4, 5, 6
    public static void PrintSubseq(int[] nums) {
        printall(0, nums, new ArrayList<>());
    }

    private static void printall(int i, int[] nums, ArrayList<Integer> list) {
        if (i >= nums.length) {
            System.out.println(list);
            return;
        }
        printall(i + 1, nums, list);
        list.add(nums[i]);
        printall(i + 1, nums, list);
        list.remove(list.size() - 1);
    }

    public static void printSubSeqSum(int[] nums, int sum) {
        System.out.println(helper2(0, nums, new ArrayList<>(), 0, sum));
    }

    private static void helper(int i, int[] nums, ArrayList<Integer> list, int j, int sum) {
        if (i >= nums.length) {
            if (sum == j) {
                System.out.println(list);
            }
            return;
        }

        helper(i + 1, nums, list, j, sum);
        list.add(nums[i]);
        j += nums[i];
        helper(i + 1, nums, list, j, sum);
        list.remove(list.size() - 1);
        j -= nums[i];
    }

    // bool
    private static boolean helper2(int i, int[] nums, ArrayList<Integer> list, int j, int sum) {
        if (i >= nums.length) {
            if (sum == j) {
                System.out.println(list);
                return true;
            }
            return false;
        }

        if (helper2(i + 1, nums, list, j, sum) == true) {
            return true;
        }
        list.add(nums[i]);
        j += nums[i];
        if (helper2(i + 1, nums, list, j, sum) == true) {
            return true;
        }
        list.remove(list.size() - 1);
        j -= nums[i];

        return false;
    }
}
