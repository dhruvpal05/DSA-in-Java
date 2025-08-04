package Recursion;

import java.util.*;;

public class PalindromPartition {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();
        solve(0, s, res, list);
        return res;
    }

    private void solve(int idx, String s, List<List<String>> res, List<String> list) {
        if (idx == s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s, idx, i)) {
                list.add(s.substring(idx, i + 1));
                solve(i + 1, s, res, list);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
