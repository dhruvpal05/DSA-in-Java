import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
    }

    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        System.out.println(Arrays.toString(words));
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals(" ")) {
                result.append(words[i]);
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
}
