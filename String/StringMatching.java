import java.util.ArrayList;

public class StringMatching {
    public static void main(String[] args) {
        String[] words = { "mass", "as", "hero", "superhero" };
        StringMatching sm = new StringMatching();
        System.out.println(sm.stringMatching(words));
    }

    public ArrayList<String> stringMatching(String[] words) {
        int n = words.length;
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = words[i];
            for (int j = 0; j < n; j++) {
                if (i != j && words[j].contains(word)) {
                    res.add(word);
                    break;
                }
            }
        }
        return res;
    }
}
