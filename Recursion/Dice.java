package Recursion;

public class Dice {
    public static void main(String[] args) {
        System.out.println(dice(4));
    }
    public static int dice(int n){
        if(n==0) return 1;
        if (n<0) {
            return 0;
        }
        int count = 0;
        for(int i=1;i<=6;i++){
            count+=dice(n-i);
        }
        return count;
    }
}
