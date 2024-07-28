package exceptionHandling;

public class SpecialNo {
    public int countNonSpecial(int l, int r) {
        int Count = 0;

        for (int i = l; i <= r; i++) {
            if (!isSpecial(i)) {
                Count++;
            }
        }
        return Count;
    }

    private boolean isSpecial(int x) {
        int count = 0;
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                count++; // i is a divisor
                if (i != x / i) {
                    count++; // x / i is a different divisor
                }
            }
        }
        return count == 3; // 1, p, p^2 (p should be prime)
    }
}
