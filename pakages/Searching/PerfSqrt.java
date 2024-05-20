package Searching;

public class PerfSqrt {
    Boolean isPerfectSquare(int num) {
            for (int i = 0; i < num; i++) {
                if(i*i==num){
                    return true;
                }
            }
            return false;
    }
}
