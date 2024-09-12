import java.util.HashSet;

public class ConsistentStr {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            h.add(allowed.charAt(i));
        }

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (h.contains(word.charAt(i))) {
                    if (i == word.length()-1) {
                        ans++;
                    }
                }else{
                    break;
                }
            }
        }

        return ans;
    }
}
