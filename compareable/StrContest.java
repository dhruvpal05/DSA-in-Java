package compareable;

public class StrContest {
    public int reverseDegree(String s) {
        int reverseDegree = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int reverseAlphabetValue = 'z' - c + 1;
            int position = i + 1;
            reverseDegree += reverseAlphabetValue * position;
        }
        return reverseDegree;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println("Reverse Degree of '" + s + "': " + getReverseDegree(s));
    }
}
