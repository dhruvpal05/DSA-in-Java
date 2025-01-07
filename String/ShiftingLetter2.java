public class ShiftingLetter2 {

    public static void main(String[] args) {
        String s = "abc";
        int[][] shifts = { { 0, 1, 1 }, { 1, 2, 2 } };
        System.out.println(shiftingLetters(s, shifts));
    }

    public static String shiftingLetters(String s, int[][] shifts) {
        StringBuilder sb = new StringBuilder(s);
        for (int[] shift : shifts) {
            if (shift[2] == 1) {
                for (int i = shift[0]; i <= shift[1]; i++) {
                    s.replace(s.charAt(i), (char) ((s.charAt(i) - 'a' + 1) % 26 + 'a'));
                }
            } else {
                for (int i = shift[0]; i <= shift[1]; i++) {
                    s.replace(s.charAt(i), (char) ((s.charAt(i) - 'a' - 1) % 26 + 'a'));
                }
            }
        }
        return sb.toString();
    }
}