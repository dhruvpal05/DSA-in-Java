package Recursion;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {
    public static void main(String[] args) {
        System.out.println(getPermute(4, 17));
    }

    // kth permutation of n!
    public static String getPermute(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact *= i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans = "";
        k = k - 1;
        while (true) {
            ans += numbers.get(k / fact);
            numbers.remove(k / fact);
            if (numbers.size() == 0) {
                break;
            }
            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;
    }
}
