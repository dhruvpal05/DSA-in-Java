package Bitmanipulation;

public class IsOdd {
    public static void main(String[] args) {
        System.out.println(isodd(21));
    }

    private static boolean isodd(int i) {
        return (i&1) == 1;
    }
}
