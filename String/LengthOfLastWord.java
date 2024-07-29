package String;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = s.length();
        int i = length - 1;
    
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int ans = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            ans++;
            i--;
        }
    
        return ans;
    }
    
}
