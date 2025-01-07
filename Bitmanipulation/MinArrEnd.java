package Bitmanipulation;

public class MinArrEnd {
    public static void main(String[] args) {
        MinArrEnd minArrEnd = new MinArrEnd();
        System.out.println(minArrEnd.minEnd(3, 2));
    }
    public long minEnd(int n, int x) {
        return (long) Math.pow(2, n) - x;
    }
}