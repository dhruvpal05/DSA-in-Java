public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPower(9));
    }

    static boolean power(int n) {
        if (n == 0)
            return false;

        if (n == 1)
            return true;

        if (n > 1)
            return n % 3 == 0 && power(n / 3);
        else
            return false;
    }

    static boolean isPower(int n) {
        if (n == 1)
            return true;

        boolean result = false;

        while (n > 0) {
            int m = n % 3;
            if (m == 0) {
                n = n / 3;
                if (n == 1)
                    return true;
            } else {
                return false;
            }
        }

        return result;
    }
}
