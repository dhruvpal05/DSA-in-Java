package Bitmanipulation;

public class IthBit {
    public static void main(String[] args) {
        System.out.println(isSet(21, 2));
    }

    private static int IthBit(int n, int i) {
        int a = 1;
        while (--i > 0) {
            a *= 10;
        }
        System.out.println(Integer.toBinaryString(n));
        System.out.println(a);
        return n & (1 << (i - 1));
    }

    private static boolean isSet(int num, int i) {
        // using left shift
        return (num & (1 << i)) != 0;
        // using right shift
    }

}
