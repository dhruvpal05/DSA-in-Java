package Stackandqueue;

import java.util.Stack;

public class ValidParent {
    public boolean checkValidString(String s) {
        int n = s.length();
        int def = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }else if(s.charAt(i) == '*'){
                def++;
            }
        }
    }
}
