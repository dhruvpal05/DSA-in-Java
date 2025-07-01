package Greedy;

public class MaxDiffByChangingInt {
    public int maxDiff(int num) {
        String str = Integer.toString(num);
        int n = str.length();
        char[] strArr = str.toCharArray();
        char c = '9';
        for (char ch : strArr) {
            if (ch != '9') {
                c = ch;
                break;
            }
        }
        str = str.replace(c, '9');

        String str2 = Integer.toString(num);
        char ch = str2.charAt(0);
        str2 = str2.replace(ch, '1');
        System.out.println(str);
        System.out.println(str2);
        return Integer.parseInt(str) - Integer.parseInt(str2);
    }
}
