package Codechef;

import java.util.*;

public class Contest {
    public static void main(String[] args) {
        int[][] points = { { 1, 0 }, { 2, 0 }, { 3, 0 }, { 2, 2 }, { 3, 2 } };
        System.out.println(countTrapezoids(points));
    }

    public static boolean checkDivisibility(int n) {
        int n1 = n;
        int sum = 0;
        int product = 1;
        while (n1 > 0) {
            int last = n1 % 10;
            n1 = n1 / 10;
            sum += last;
            product *= last;
        }
        return n % (sum + product) == 0;
    }

    public static int countTrapezoids(int[][] points) {
        int mod = 1_000_000_007;
        Map<Integer, Integer> yCount = new HashMap<>();
        for (int[] point : points) {
            yCount.put(point[1], yCount.getOrDefault(point[1], 0) + 1);
        }
        List<Long> combs = new ArrayList<>();
        for (int cnt : yCount.values()) {
            if (cnt >= 2) {
                long c2 = ((long) cnt * (cnt - 1) / 2);
                combs.add(c2);
            }
        }
        long result = 0;
        int m = combs.size();
        long[] prefixSum = new long[m + 1];
        for (int i = 0; i < m; ++i) {
            prefixSum[i + 1] = (prefixSum[i] + combs.get(i)) % mod;
        }
        for (int i = 0; i < m; ++i) {
            long add = (combs.get(i) * ((prefixSum[m] - prefixSum[i + 1] + mod) % mod)) % mod;
            result = (result + add) % mod;
        }

        return (int) result;
    }
}
