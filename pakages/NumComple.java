package pakages;

public class NumComple {
    public int findComplement(int num) {
        String number = Integer.toBinaryString(num);
        String ans = "";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') {
                ans += '0';
            } else {
                ans += '1';
            }
        }

        return binaryToInteger(ans);

    }

    public static int binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        int result = 0;
        for (int i = numbers.length - 1; i >= 0; i--)
            if (numbers[i] == '1')
                result += Math.pow(2, (numbers.length - i - 1));
        return result;
    }
}
