public class NumberOfSteps {
    public static void main(String[] args) {
        int ans = numberOfSteps(14);
        System.out.println(ans);
    }

    static int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }
        int count = 0;
        if (num % 2 == 0) {
            count = 1 + numberOfSteps(num / 2);
        } else {
            count = 1 + numberOfSteps(num - 1);
        }

        return count;
    }

}
