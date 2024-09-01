package Arrays;

public class ExpressiveWords {
    public int expressiveWords(String s, String[] words) {
        int ans = 0;
        for (String word : words) {
            ans+=solve(s,word);
        }
        return ans;
    }

    private int solve(String s, String word) {
        if(s.length() < word.length())
            return 0;

        int i = 0, j = 0;

        while(i < s.length() && j < word.length()) {
            if(s.charAt(i) != word.charAt(j))
                return 0;

            final char curr = word.charAt(j);
            int sCount = 0;

            while(i < s.length() && s.charAt(i) == curr) {
                sCount++;
                i++;
            }

            int wordCount = 0;

            while(j < word.length() && word.charAt(j) == curr) {
                wordCount++;
                j++;
            }

            if(sCount - wordCount < 0 || (sCount - wordCount != 0 && sCount < 3))
                return 0;
        }
        if (i >= s.length() && j >= word.length()) {
            return 1;
        }else{
            return 0;
        }
    }
}
