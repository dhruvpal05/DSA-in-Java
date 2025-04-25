package Recursion;

import java.util.*;

public class DelMiddleEle {
    public void solve(Stack<Integer> stack, int index) {
        if (index == 0) {
            stack.pop();
            return;
        }
        int temp = stack.pop();
        solve(stack, index - 1);
        stack.push(temp);
    }

    public void revStack(Stack<Integer> stack){
        
    }
}
