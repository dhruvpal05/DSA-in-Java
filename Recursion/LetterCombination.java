package Recursion;

import java.util.List;
import java.util.ArrayList;

public class LetterCombination {

    public static void main(String[] args) {
        LetterCombination lc = new LetterCombination();
        System.out.println(lc.letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        StringBuilder p = new StringBuilder();
        String[] phone_map = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        helper(res, phone_map, p, digits);
        return res;
    }

    private void helper(List<String> res, String[] phone_map, StringBuilder p, String digits) {
        if(digits.isEmpty()){
            res.add(p.toString());
            return;
        }
        String str = phone_map[digits.charAt(0)-'2'];
        for (int i = 0; i < str.length(); i++) {
            p.append(str.charAt(i));
            helper(res, phone_map, p, digits.substring(1));
            p.deleteCharAt(p.length()-1);
        }
    }
}
