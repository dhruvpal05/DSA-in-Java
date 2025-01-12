package Greedy;

import java.util.HashMap;

public class Kpalindrome {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        int count  = 0;
        for(char c : map.keySet()){
            if(map.get(c)%2==1){
                count++;
            }
        }
        return (count>k)?false:true;
    }
}
