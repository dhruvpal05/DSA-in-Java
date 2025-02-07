package Arrays;

public class Lemonade {
    public boolean lemonadeChange(int[] bills) {
        int cash = 0;
        for (int bill : bills) {
            if (bill == 10) {
                if (cash - bill < 5) {
                    return false;
                }
                cash +=5;
            }
            if (bill == 20) {
                if (cash - bill < 10) {
                    return false;
                }
                cash +=5;
            }
            cash +=5;
        }
        return true;
    }
}
