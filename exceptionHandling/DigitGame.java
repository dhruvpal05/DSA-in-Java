package exceptionHandling;

public class DigitGame {
    public boolean canAliceWin(int[] nums) {
        int alice = 0;
        int bob = 0;
        for (int num : nums) {
            if (num%10 == num) {
                alice+=num;
            }else{
                bob+=num;
            }
        }
        return alice!=bob;
    }
}
