package Stackandqueue;

import java.util.Stack;

public class ParenthesisStr {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) return false;
    
        int open = 0, flexible = 0;
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '1') {
                if (s.charAt(i) == '(') open++;
                else open--;
            } else {
                flexible++;
            }
            if (open + flexible < 0) return false;
        }
    
        open = 0;
        flexible = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (locked.charAt(i) == '1') {
                if (s.charAt(i) == ')') open++;
                else open--;
            } else {
                flexible++;
            }
            if (open + flexible < 0) return false;
        }
        return true;
    }
    
}
