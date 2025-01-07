package Recursion;

public class FiveFactor {
    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(digitSum(1342));
    }

    public static int fact(int n){
        while (n==1) {
            return 1;
        }

        return n*fact(n-1);
    }

    public static int digitSum(int n){
        if(n%10==n){
            return n;
        }
        return n%10+digitSum(n/10);
    }

    // 1234
    // public static int revNun(int n){
        
    // }
}
