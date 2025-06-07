package exceptionHandling;

import java.util.HashMap;

import javax.swing.tree.TreeNode;

public class CandiesChild2 {
    public long distributeCandies(int n, int limit) {
        long ways = 0;
        int min = Math.max(0, n - 2 * limit);
        int max = Math.min(limit, n);
        for (int i = min; i <= max; i++) {
            int N = n - i;
            int ch2min = Math.max(0, N - limit);
            int ch2max = Math.min(limit, N);

            ways += (ch2max - ch2min + 1);
        }
        return ways;
    }

    public String answerString(String word, int numFriends) {
        int n = word.length();
        int max = n - numFriends;
        String ans = "";
        for (int i = 0; i < n; i++) {

            if (i + max >= n) {
                ans = (ans.compareTo(word.substring(i, n)) < 0) ? word.substring(i, n) : ans;
            } else {
                ans = (ans.compareTo(word.substring(i, i + max)) < 0) ? word.substring(i, i + max) : ans;
            }
        }

        return ans;
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        String ans = "";
        int n = s1.length();
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map1.put(s1.charAt(i), s2.charAt(i));
            map2.put(s2.charAt(i), s1.charAt(i));
        }

        for (int i = 0; i < baseStr.length(); i++) {
            Character c = baseStr.charAt(i);
            if (map1.containsKey(c) || map1.containsKey(map2.get(c))) {
                c = (Character.compare(c, map1.get(c)) > 0) ? c : map1.get(c);
            }
            if (map2.containsKey(c) || map2.containsKey(map1.get(c))) {
                c = (Character.compare(c, map2.get(c)) > 0) ? c : map1.get(c);
            }
            ans += c;
        }

        return ans;
    }
}
