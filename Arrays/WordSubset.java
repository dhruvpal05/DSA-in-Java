package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordSubset {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        for(String word:words2){
            char[] charArr = word.toCharArray();
            for(char c:charArr){
                set.add(c);
            }
        }
        boolean flag = true;
        for(String word : words1){
            for(Character c : set){
                if(!word.contains(c.toString())){
                    flag = false;
                    break;
                }
            }
            if(flag){
                res.add(word);
            }else{
                flag = true;
            }
        }
        return res;
    }
}
